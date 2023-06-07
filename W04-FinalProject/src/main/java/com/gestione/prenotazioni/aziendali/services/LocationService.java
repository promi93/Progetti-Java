package com.gestione.prenotazioni.aziendali.services;



import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gestione.prenotazioni.aziendali.model.Location;
import com.gestione.prenotazioni.aziendali.repository.LocationRepository;

@Service
public class LocationService {
	
	@Autowired private LocationRepository location;
	@Autowired @Qualifier("newLocation") ObjectProvider<Location> loc1;

	
	public Location getById(Long id) {
		return location.findById(id).get();
	}
	
	public Location createLocation(Location loc) {
		return location.save(loc);
	}
	
	public void deleteLocation(Long id) {
		location.deleteById(id);
	}

}
