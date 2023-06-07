package com.gestione.prenotazioni.aziendali.services;


import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gestione.prenotazioni.aziendali.model.Building;
import com.gestione.prenotazioni.aziendali.repository.BuildingRepository;

@Service
public class BuildingService {
	
	@Autowired private BuildingRepository build;
	@Autowired @Qualifier("createBuilding") ObjectProvider<Building> build1;


	public Building getByBuildingID(Long id) {
		return build.findById(id).get();
	}
	
	public Building saveBuilding(Building bu) {
		return build.save(bu);
	}

	
	public void deleteBuildgin(Long id) {
		build.deleteById(id);
	}
	

}
