package com.gestione.prenotazioni.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestione.prenotazioni.model.Location;
import com.gestione.prenotazioni.repository.LocationRepository;

@Service
public class LocationService {
	
	@Autowired private LocationRepository location;
	
	public Location getLocationById(Long id) {
		return location.findById(id).get();
	}
	
	public Location createLocation(Location loc) {
		return location.save(loc);
	}
	
	public Location updateLocation(Long id, Location loc) {
		return location.save(loc);
	}

	public void deleteLocation(Long id) {
		location.deleteById(id);
	}
}
