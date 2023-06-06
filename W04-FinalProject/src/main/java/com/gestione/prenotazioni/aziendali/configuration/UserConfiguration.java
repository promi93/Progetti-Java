package com.gestione.prenotazioni.aziendali.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.gestione.prenotazioni.aziendali.model.User;

@Configuration
public class UserConfiguration {

	@Bean
	@Scope("prototype")
	public User createUser() {
		
		User user1=new User();
		user1.setUsername("User1");
		user1.setFullName("Pier Giovanni");
		user1.setEmail("p.giovanni@email.com");
		return user1;
	}
}
