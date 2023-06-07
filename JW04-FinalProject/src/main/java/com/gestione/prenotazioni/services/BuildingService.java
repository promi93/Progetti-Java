package com.gestione.prenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestione.prenotazioni.model.Building;
import com.gestione.prenotazioni.repository.BuildingRepository;

import jakarta.persistence.EntityExistsException;

@Service
public class BuildingService {
	
	@Autowired private BuildingRepository build;
	
	public List<Building> getAllBuilding() {
		return build.findAll();
	}

	public Building getBuildingByID(Long id) {
		if(!build.existsById(id)) {
			throw new EntityExistsException("Edificio ID non Esiste!!!");
		}
		return build.findById(id).get();
	}

	public Building createBuilding(Building building) {
		if(build.findByNameAddressCity(building.getName(), building.getAddress(), building.getCity()) != null) {
			throw new EntityExistsException("Edificio già Presente!!!");
		}
		return build.save(building);
	}

	public Building updateBuilding(Long id, Building building) {
		if(!build.existsById(id)) {
			throw new EntityExistsException("Edificio ID non Esiste!!!");
		}
		return build.save(building);
	}

	public String removeBuilding(Long id) {
		if(!build.existsById(id)) {
			throw new EntityExistsException("Edificio ID non Esiste!!!");
		}
		build.deleteById(id);
		return "Edificio eliminato!!!";
	}

}