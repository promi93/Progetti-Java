package com.gestione.prenotazioni.aziendali.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestione.prenotazioni.aziendali.model.Location;
import com.gestione.prenotazioni.aziendali.repository.LocationRepository;

@Service
public class LocationService {
	
	@Autowired private LocationRepository location;
	
	public Optional<Location> getById(Long id) {
		return location.findById(id);
	}
	
	public Location createLocation(Location loc) {
		return location.save(loc);
	}
	
	public void deleteLocation(Long id) {
		location.deleteById(id);
	}

}
