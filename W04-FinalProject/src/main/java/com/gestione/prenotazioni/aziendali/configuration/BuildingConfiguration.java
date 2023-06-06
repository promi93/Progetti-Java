package com.gestione.prenotazioni.aziendali.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import com.gestione.prenotazioni.aziendali.model.Building;


@Configuration
public class BuildingConfiguration {

	@Bean
	@Scope("prototype")
	public Building FakeEdificio() {
		Building building =new Building();
		building.setName("Edificio A");
		building.setAddress("Via - Don Minzoni, n°20");
		building.setCity("Milano");
		return building;
	}
}