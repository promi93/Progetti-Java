package com.gestione.prenotazioni.aziendali.repository;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gestione.prenotazioni.aziendali.model.Booking;
import com.gestione.prenotazioni.aziendali.model.User;

public interface BookingRepository extends JpaRepository<Booking, Long> {
	
	public Page<Booking> findByUserBooking(User user, LocalDate booked_up, Pageable pageable);
	public Page<Booking> findByUser(User user, Pageable pageable);

}
