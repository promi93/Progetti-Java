package com.gestione.prenotazioni.aziendali.runner;

import com.gestione.prenotazioni.aziendali.configuration.BookingConfiguration;
import com.gestione.prenotazioni.aziendali.configuration.BuildingConfiguration;
import com.gestione.prenotazioni.aziendali.configuration.LocationConfiguration;
import com.gestione.prenotazioni.aziendali.configuration.UserConfiguration;
import com.gestione.prenotazioni.aziendali.model.Booking;
import com.gestione.prenotazioni.aziendali.model.Building;
import com.gestione.prenotazioni.aziendali.model.Location;
import com.gestione.prenotazioni.aziendali.model.TypeOfLocation;
import com.gestione.prenotazioni.aziendali.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BookingRunner implements CommandLineRunner {

    @Autowired
    private UserConfiguration user;
    
    @Autowired
    private BookingConfiguration booking;
    
    @Autowired
    private BuildingConfiguration building;
    
    @Autowired
    private LocationConfiguration location;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

	User listAUser = user.createUser();
	
	Booking bookingList = booking.bookingReservation();
	
	Building listBuildingi = building.createBuilding();
	
	Location listLocation = location.newLocation("Milano", TypeOfLocation.OPENSPACE);

    
   
}
