package com.gestione.prenotazioni.aziendali.services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gestione.prenotazioni.aziendali.model.User;
import com.gestione.prenotazioni.aziendali.repository.UserRepository;

@Service
public class UserSevice {
	
	@Autowired private UserRepository user;
	@Autowired @Qualifier("createUser") ObjectProvider<User> user1;
	
	
	public User getById(Long id) {
		return user.findById(id).get();
	}
	
	public User saveUser(User id) {
		User u1 = user.save(id);
		System.out.println(u1);
		return u1;
		
	}
	
	public void deleteById(Long id) {
		user.deleteById(id);
	}
	
	
	public User createUser() {
		return user1.getObject();
	}
	

	
	
}