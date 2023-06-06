package com.gestione.prenotazioni.aziendali.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gestione.prenotazioni.aziendali.model.City;

public interface CityRepository extends JpaRepository<City, Long> {
	
	public List<City> findByName(String name, List<City> lib);

}
