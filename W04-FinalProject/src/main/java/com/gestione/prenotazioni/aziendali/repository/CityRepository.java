package com.gestione.prenotazioni.aziendali.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.gestione.prenotazioni.aziendali.model.City;

public interface CityRepository extends JpaRepository<City, Long> {
	
	public Page<City> findByName(String name, Pageable pageable);

}
