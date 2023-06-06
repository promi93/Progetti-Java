package com.gestione.prenotazioni.aziendali.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import com.gestione.prenotazioni.aziendali.model.Building;
import com.gestione.prenotazioni.aziendali.model.City;

public interface BuildingRepository extends JpaRepository<Building, Long>{

	List<Building> findByCity(City city, List<Building> lib);
	List<Building> findByName(String name, List<Building> lib);
	
	
}
