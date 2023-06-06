package com.gestione.prenotazioni.aziendali.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.gestione.prenotazioni.aziendali.model.Location;

@Configuration
public class LocationConfiguration {

	@Bean
	@Scope("prototype")
	public Location newLocation() {
		return new Location();
	}
}