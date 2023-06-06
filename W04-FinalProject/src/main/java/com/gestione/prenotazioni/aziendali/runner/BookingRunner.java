package com.gestione.prenotazioni.aziendali.runner;

import com.gestione.prenotazioni.aziendali.model.Booking;
import com.gestione.prenotazioni.aziendali.model.Location;
import com.gestione.prenotazioni.aziendali.model.User;
import com.gestione.prenotazioni.aziendali.repository.BookingRepository;
import com.gestione.prenotazioni.aziendali.repository.LocationRepository;
import com.gestione.prenotazioni.aziendali.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class BookingRunner {

    private final BookingRepository bookingRepository;
    private final LocationRepository locationRepository;
    private final UserRepository userRepository;

    @Autowired
    public BookingRunner(BookingRepository bookingRepository,
    		LocationRepository locationRepository,
                         UserRepository userRepository) {
        this.bookingRepository = bookingRepository;
        this.locationRepository = locationRepository;
        this.userRepository = userRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void run() {
        
        Location location = locationRepository.findById("001B");

       
        User user = userRepository.findByUsername("user1");

    
        Booking booking1 = new Booking();
        booking1.setLocation(location);
        booking1.setUser(user);
        booking1.setData_prenotazione(LocalDate.now());
        bookingRepository.save(booking1);

        
        Booking booking2 = new Booking();
        booking2.setLocation(location);
        booking2.setUser(user);
        booking2.setData_prenotazione(LocalDate.now().plusDays(1));
        bookingRepository.save(booking2);

       
    }
}
