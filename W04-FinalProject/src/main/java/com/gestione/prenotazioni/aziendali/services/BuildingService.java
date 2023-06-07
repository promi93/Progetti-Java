package com.gestione.prenotazioni.aziendali.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestione.prenotazioni.aziendali.model.Building;
import com.gestione.prenotazioni.aziendali.repository.BuildingRepository;

@Service
public class BuildingService {
	
	@Autowired private BuildingRepository build;

	public Optional<Building> getByBuildingID(Long id) {
		return build.findById(id);
	}
	
	public Building createBuilding(Building bu) {
		return build.save(bu);
	}

	
	public void deleteBuildgin(Long id) {
		build.deleteById(id);
	}
	

}
