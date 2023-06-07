package com.gestione.prenotazioni.aziendali.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestione.prenotazioni.aziendali.model.User;
import com.gestione.prenotazioni.aziendali.repository.UserRepository;

@Service
public class UserSevice {
	
	@Autowired private UserRepository user;
	
	
	public User getById(Long id) {
		return user.findById(id).get();
	}
	
	public User createUser(User id) {
		return user.save(id);
	}
	
	public void deleteById(Long id) {
		user.deleteById(id);
	}
	
	
	

	
	
}