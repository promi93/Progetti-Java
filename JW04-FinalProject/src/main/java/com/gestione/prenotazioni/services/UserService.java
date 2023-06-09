package com.gestione.prenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestione.prenotazioni.model.User;
import com.gestione.prenotazioni.repository.UserRepository;

@Service
public class UserService {

	@Autowired private UserRepository user;
	
	public List<User> getAllUsers() {
		return user.findAll();
	}
	
	public User getUserByID(Long id) {
		return user.findById(id).get();
	}
	
	public User createUser(User user1) {
		return user.save(user1);
	}
	
	public User updateUser(Long id, User user1) {
		return user.save(user1);
	}
	
	public void deleteUser(Long id) {
		user.deleteById(id);
	}
	
}
