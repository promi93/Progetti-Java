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

	public String addDispositivoToUente(Dispositivo dispostivo, Long id) {
		Long DIPI = dispostivo.getId();
		Utente u = findUtenteById(id);
		if (!dispositivoRepo.findById(DIPI).isPresent()) {
			System.out.println("Dispositivo inesistente");
			return "Dispositivo inesistente";
		} else if (u == null) {
			System.out.println("Utente non trovato!");

			return "Utente non trovato!";
		} else if (dispostivo.getDisponibilita(null) != StatoDispositivo.DISPONIBILE) {
			System.out.println("Errore dispositivo!");
			return "Errore dispositivo!";
		} else {
			dispostivo.getDisponibilita(StatoDispositivo.ASSEGNATO);
			u.addDisp(dispostivo);
			dispostivo.setUtente(u);
			utenteRepo.save(u);
			System.out.println("Dispositivo assegnato al dipendente!");
			return "Dispositivo assegnato al dipendente!";
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
		return "Utente cancellato!!!";
	}

	public Utente updateUtente(Utente u) {
		utenteRepo.save(u);
		return u;
	}
}
