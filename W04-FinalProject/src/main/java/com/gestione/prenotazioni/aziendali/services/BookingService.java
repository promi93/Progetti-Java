package com.gestione.prenotazioni.aziendali.services;


import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gestione.prenotazioni.aziendali.model.Booking;
import com.gestione.prenotazioni.aziendali.repository.BookingRepository;

@Service
public class BookingService {

	@Autowired private BookingRepository bookUser;
	@Autowired @Qualifier("bookingReservation") ObjectProvider<Booking> book1;
	
	public Booking getByBooking(Long id) {
		return bookUser.findById(id).get();
	}
	
	public Booking createBooking(Booking book) {
		return bookUser.save(book);
	}
	
	
	public void deleteBooking(Long id) {
		 bookUser.deleteById(id);
	}
	
	
	
}
