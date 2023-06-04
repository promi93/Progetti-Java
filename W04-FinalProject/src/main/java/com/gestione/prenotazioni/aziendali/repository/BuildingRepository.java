package com.gestione.prenotazioni.aziendali.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import com.gestione.prenotazioni.aziendali.model.Building;
import com.gestione.prenotazioni.aziendali.model.City;

public interface BuildingRepository extends JpaRepository<Building, Long>{

	Page<Building> findByCity(City city, Pageable pageable);
	Page<Building> findByName(String name, Pageable pageable);
	
	
}
