package com.dispositivi.aziendali.project.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dispositivi.aziendali.project.model.Dispositivo;
import com.dispositivi.aziendali.project.model.StatoDispositivo;
import com.dispositivi.aziendali.project.model.Utente;
import com.dispositivi.aziendali.project.repository.DispositivoRepository;
import com.dispositivi.aziendali.project.repository.UtenteRepository;



@Service
public class UtenteService {

	@Autowired
	private UtenteRepository utenteRepo;
	@Autowired
	private DispositivoRepository dispositivoRepo;
	@Autowired
	@Qualifier("FakeUtente") 
	private ObjectProvider<Utente> fakeUtenteProvider;
	@Autowired
	@Qualifier("ParamsUtente")
	private ObjectProvider<Utente> paramsUtenteProvider;

	public void createFakeDipendente() {
		Utente u = fakeUtenteProvider.getObject();
		createUtente(u);

	}

	public String addDispositivoToUente(Dispositivo d, Long id) {
		Long DIPI = d.getId();
		Utente u = findUtenteById(id);
		if (!dispositivoRepo.findById(DIPI).isPresent()) {
			System.out.println("dispositive inexistant");
			return "dispositive inexistant";
		} else if (u == null) {
			System.out.println("no user found with that id");

			return "no user found with that id";
		} else if (d.getDisponibilita(null) != StatoDispositivo.DISPONIBILE) {
			System.out.println("d not available");
			return "Dispositive not available";
		} else {
			d.getDisponibilita(StatoDispositivo.ASSEGNATO);
			u.addDisp(d);
			d.setDipendente(u);
			utenteRepo.save(u);
			System.out.println("dispositive added to user");
			return "dispositive added to user";
		}

	}

	public Utente createUtente(Utente u) {
		utenteRepo.save(u);
		return u;
	}

	public Utente createUtente(String username, String email, String nome, String cognome,
			List<Dispositivo> dispositivi) {
		Utente u = paramsUtenteProvider.getObject(username, email, cognome, dispositivi);
		createUtente(u);
		return u;
	}

	public Utente findUtenteById(Long id) {
		return utenteRepo.findById(id).get();
	}

	public List<Utente> findAllUtente() {
		return (List<Utente>) utenteRepo.findAll();
	}

	public String removeUtente(Long id) {
		utenteRepo.deleteById(id);
		return "User Deleted!!!";
	}

	public Utente updateUtente(Utente u) {
		utenteRepo.save(u);
		return u;
	}
}
