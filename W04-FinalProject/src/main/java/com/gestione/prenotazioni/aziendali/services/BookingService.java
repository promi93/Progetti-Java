package com.gestione.prenotazioni.aziendali.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestione.prenotazioni.aziendali.model.Booking;
import com.gestione.prenotazioni.aziendali.repository.BookingRepository;

@Service
public class BookingService {

	@Autowired private BookingRepository bookUser;
	
	public Optional<Booking> getByBooking(Long id) {
		return bookUser.findById(id);
	}
	
	public Booking createBooking(Booking book) {
		return bookUser.save(book);
	}
	
	
	public void deleteBooking(Long id) {
		 bookUser.deleteById(id);
	}
	
	
}
