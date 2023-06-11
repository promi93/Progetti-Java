package com.dispositivi.aziendali.project.configuration;
import java.util.List;
import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.dispositivi.aziendali.project.model.Dispositivo;
import com.dispositivi.aziendali.project.model.Utente;
import com.github.javafaker.Faker;



@Configuration
@PropertySource("classpath:application.properties")
public class UtenteConfiguration {



		@Bean("CustomUtente")
		@Scope("prototype")
		public Utente customUtente() {
			return new Utente();
		}

		@Bean("ParamsUtente")
		@Scope("prototype")
		public Utente paramsUser(String username, String email, String name, String surname, List<Dispositivo> dispositivi) {
			return new Utente(username, email, name,  surname, dispositivi);
		}

		@Bean("FakeUtente")
		@Scope("prototype")
		public Utente createFakeDipendente() {
			Utente u = new Utente();
			Faker fake = new Faker(new Locale("it-IT"));
			u.setName(fake.name().firstName());
			u.setSurname(fake.name().lastName());
			u.setUsername(fake.name().username());
			u.setEmail(fake.internet().emailAddress());
		
			return u;
		}
	}


