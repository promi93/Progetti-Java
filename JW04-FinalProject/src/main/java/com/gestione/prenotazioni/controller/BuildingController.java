package com.gestione.prenotazioni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestione.prenotazioni.model.Building;
import com.gestione.prenotazioni.services.BuildingService;

@RestController
@RequestMapping("/api/edifici")
public class BuildingController {
	
	@Autowired private BuildingService buildingService;
	
	@GetMapping
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok(buildingService.getAllBuilding());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id) {
		return ResponseEntity.ok(buildingService.getBuildingByID(id));
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Building building) {
		return ResponseEntity.ok(buildingService.createBuilding(building));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Building building) {
		return ResponseEntity.ok(buildingService.updateBuilding(id, building));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> remove(@PathVariable Long id) {
		return ResponseEntity.ok(buildingService.removeBuilding(id));
	}

}
