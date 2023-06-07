package com.gestione.prenotazioni.aziendali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestione.prenotazioni.aziendali.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByID(Long id);
	User findByUserName(String username);
	User findByFullName(String fullname);
	
}
