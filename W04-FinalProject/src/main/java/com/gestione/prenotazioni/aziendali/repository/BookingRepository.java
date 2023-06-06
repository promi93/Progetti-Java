package com.gestione.prenotazioni.aziendali.repository;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gestione.prenotazioni.aziendali.model.Booking;
import com.gestione.prenotazioni.aziendali.model.User;

public interface BookingRepository extends JpaRepository<Booking, Long> {
	
	public List<Booking> findByUserBooking(User user, LocalDate booked_up, List<Booking> lib);
	public List<Booking> findByUser(User user, List<Booking> lib);

}
