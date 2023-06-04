package com.gestione.prenotazioni.aziendali.runner;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gestione.prenotazioni.aziendali.model.Building;
import com.gestione.prenotazioni.aziendali.model.City;
import com.gestione.prenotazioni.aziendali.model.Location;
import com.gestione.prenotazioni.aziendali.model.TypeOfLocation;
import com.gestione.prenotazioni.aziendali.model.User;
import com.gestione.prenotazioni.aziendali.model.UserFunction;
import com.gestione.prenotazioni.aziendali.model.UserType;
import com.gestione.prenotazioni.aziendali.repository.BuildingRepository;
import com.gestione.prenotazioni.aziendali.repository.CityRepository;
import com.gestione.prenotazioni.aziendali.repository.LocationRepository;
import com.gestione.prenotazioni.aziendali.repository.UserTypeRepository;


@Component
public class BookingRunner implements CommandLineRunner {

	@Autowired
	UserTypeRepository userTypeRepository;
	
	@Autowired
	BuildingRepository buildingRepository;
	
	@Autowired
	CityRepository cityRepository;
	
	@Autowired
	LocationRepository locationRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		if(cityRepository.count() == 0) {
			City createCity = createCity();
			List<UserType> userType = createUserType();
			List<Building> building = createBuilding(createCity);
			List<Location> location = createLocation(building);
			User user = createUser(userType);
		}
		
	}
	
	
	private User createUser(List<UserType> function) {
		User user = new User();
		user.setEmail("user1@email.it");
		user.setFullName("Pippo Baudo");
		user.setUsername("PippoBaudo79");
		user.setPassword("password");
		user.setFunction(new HashSet<UserType>(function));
		
		System.out.println("Utente: " + user.getFullName() + " salvato!!!");
		
		return user;
		
	}
	
	private List<Building> createBuilding(City createCity) {
		List<Building> list = new ArrayList<Building>();
		
		Building building = new Building();
		building.setCity("Bologna");
		building.setAddress("Via Corleone n°10");
		building.setName("Sede-Milano");
		buildingRepository.save(building);
		list.add(building);
		System.out.println("Edificio salvato!!!");
		
		building = new Building();
		building.setCity("Modena");
		building.setAddress("Via Gino n°23");
		building.setName("Sede-Roma");
		buildingRepository.save(building);
		list.add(building);
		System.out.println("Edificio salvato!!!");
		
		return list;
		
	}
	
	private City createCity() {
		City city = new City();
		city.setName("Trento");
		cityRepository.save(city);
		System.out.println("Città salvata!!!");
		
		return city;
	}
	
	private List<Location> createLocation(List<Building> building) {
		List<Location> loc = new ArrayList<Location>();
				for( Building bu : building) {
					for (int i = 1; i < 10; i++) {
						Location local = new Location();
						local.setId(i + bu.getName());
						local.setBuilding(bu);
						local.setNumberPeople(i);
						local.setTypeLocation(TypeOfLocation.OPENSPACE);
						locationRepository.save(local);
						System.out.println("Postazione salvata con successo!!!");
						loc.add(local);
						
					}
				}
				return loc;
	}
	
	private List<UserType> createUserType() {
		List<UserType> us = new ArrayList<UserType>();
		UserType userr = new UserType();
		userr.setUserFunction(UserFunction.FUNCTION_ADMIN);
		userTypeRepository.save(userr);
		us.add(userr);
		System.out.println("User Admin salvato!!!");
		userr = new UserType();
		userr.setUserFunction(UserFunction.FUNCTION_USER);
		userTypeRepository.save(userr);
		System.out.println("User normale salvato!!!");

		return us;
	}

}

