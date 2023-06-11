package com.dispositivi.aziendali.project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.dispositivi.aziendali.project.model.Dispositivo;
import com.dispositivi.aziendali.project.model.DispositivoAssegnato;
import com.dispositivi.aziendali.project.model.StatoDispositivo;
import com.dispositivi.aziendali.project.model.Utente;


@Configuration
@PropertySource("classpath:application.properties")
public class DispositivoConfiguration {

	@Bean("CustomDispositivo")
	@Scope("prototype")
	public Dispositivo customDispositivo() {
		return new Dispositivo();
	}

	@Bean("ParamsDispositivo")
	@Scope("prototype")
	public Dispositivo paramsDispositivo(DispositivoAssegnato tipoDispositivo, StatoDispositivo statoDispositivo, Utente dipendente) {
		return new Dispositivo(tipoDispositivo, statoDispositivo, dipendente);
	}


}
