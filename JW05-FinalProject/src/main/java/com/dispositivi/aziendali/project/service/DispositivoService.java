package com.dispositivi.aziendali.project.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dispositivi.aziendali.project.model.Dispositivo;
import com.dispositivi.aziendali.project.model.DispositivoAssegnato;
import com.dispositivi.aziendali.project.model.StatoDispositivo;
import com.dispositivi.aziendali.project.model.Utente;
import com.dispositivi.aziendali.project.repository.DispositivoRepository;

@Service
public class DispositivoService {





	

		@Autowired private DispositivoRepository dispoRepo;
		@Autowired @Qualifier("ParamsDispositivo") private ObjectProvider<Dispositivo> paramsDispositivoProvider;
		

		
		public Dispositivo createDispositivo(Dispositivo u) {
			dispoRepo.save(u);
			return u;
		}
		public Dispositivo createDispositivo(DispositivoAssegnato tipoDisositivo, StatoDispositivo disponibilitaDispositivo, Utente dipendente) {
			Dispositivo u= paramsDispositivoProvider.getObject( tipoDisositivo,  disponibilitaDispositivo,  dipendente); 
			createDispositivo(u);
			return u;
		}

		public Dispositivo findDispositivoById(Long id) {
			return dispoRepo.findById(id).get();
		}
		
		public List<Dispositivo> findAllDispositivo() {
			return (List<Dispositivo>) dispoRepo.findAll();
		}
		
		public String removeDispositivo(Long id) {
			dispoRepo.deleteById(id);
			return "Dispositivo Deleted!!!";
		}
		public Dispositivo updateDispositivo(Dispositivo u) {
			dispoRepo.save(u);
			return u;
		}
	}


