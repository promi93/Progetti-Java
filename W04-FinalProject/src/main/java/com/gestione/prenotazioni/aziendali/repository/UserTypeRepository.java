package com.gestione.prenotazioni.aziendali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gestione.prenotazioni.aziendali.model.UserType;

public interface UserTypeRepository extends JpaRepository<UserType, Long>{
	

}
