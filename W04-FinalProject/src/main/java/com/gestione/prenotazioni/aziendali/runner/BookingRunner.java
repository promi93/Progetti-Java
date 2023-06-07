package com.gestione.prenotazioni.aziendali.runner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gestione.prenotazioni.aziendali.model.User;
import com.gestione.prenotazioni.aziendali.services.UserSevice;


@Component
public class BookingRunner implements CommandLineRunner {

	@Autowired UserSevice user1;
	
	@Override
	public void run(String... args) throws Exception {
		

		
		User userr =  user1.createUser();
		user1.saveUser(userr);
		
		
		
	}

 

	
    
   
}
