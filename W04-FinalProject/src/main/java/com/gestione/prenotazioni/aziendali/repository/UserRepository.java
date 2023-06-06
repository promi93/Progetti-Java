package com.gestione.prenotazioni.aziendali.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gestione.prenotazioni.aziendali.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	List<User> findByName(String name, List<User> lib);
	List<User> findByUserName(String name);

}
