package com.gestione.prenotazioni.aziendali.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.gestione.prenotazioni.aziendali.model.Booking;

@Configuration
public class BookingConfiguration {

	@Bean
	@Scope("prototype")
	public Booking bookingReservation() {
		return new Booking();
	}
}