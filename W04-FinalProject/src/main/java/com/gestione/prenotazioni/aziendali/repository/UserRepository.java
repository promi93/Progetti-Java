package com.gestione.prenotazioni.aziendali.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gestione.prenotazioni.aziendali.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	Page<User> findByName(String name, Pageable pageable);
	Optional<User> findByUserName(String name);

}
