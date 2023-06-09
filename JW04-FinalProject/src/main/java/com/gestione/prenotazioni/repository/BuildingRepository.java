package com.gestione.prenotazioni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestione.prenotazioni.model.Building;

@Repository
public interface BuildingRepository extends JpaRepository<Building, Long> {

	public Building findByNameAndAddressAndCity(String name, String address, String city);
	
}