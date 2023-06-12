package com.dispositivi.aziendali.project.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.dispositivi.aziendali.project.model.DispositivoAssegnato;
import com.dispositivi.aziendali.project.model.StatoDispositivo;
import com.dispositivi.aziendali.project.repository.DispositivoRepository;
import com.dispositivi.aziendali.project.repository.UtenteRepository;
import com.dispositivi.aziendali.project.service.UtenteService;
import com.dispositivi.aziendali.project.service.DispositivoService;


@Component
public class MainRunner implements ApplicationRunner {

	// Service
	@Autowired UtenteService utenteService;
	@Autowired DispositivoService dispositivoService;
	
	//Repo
    @Autowired UtenteRepository utenteRepository;
    @Autowired DispositivoRepository dispositivoRepository;
    
    
    
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		dispositivoService.createDispositivo(DispositivoAssegnato.SMARTPHONE, StatoDispositivo.DISMESSO, null);
		utenteService.createFakeDipendente();
		utenteService.addDispositivoToUente(dispositivoRepository.findById(1l).get(), 2l);

	}

}
