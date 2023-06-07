package com.gestione.prenotazioni.aziendali.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.gestione.prenotazioni.aziendali.model.Building;
import com.gestione.prenotazioni.aziendali.model.Location;
import com.gestione.prenotazioni.aziendali.model.TypeOfLocation;

@Configuration
public class LocationConfiguration {

	@Bean
	@Scope("prototype")
	public Location newLocation(String string, TypeOfLocation openspace) {
		Location loc1 = new Location();
		Building build = new Building();
		build.setName("Edificio A");
		loc1.setBuilding(build);
		loc1.setDescription("Descrizione Edificio A");
		loc1.setId_book("prenotato da ID001");
		loc1.setNumberMaxPartecipanti(10);
		loc1.setType(TypeOfLocation.OPENSPACE);
		return loc1;
		
	}


}