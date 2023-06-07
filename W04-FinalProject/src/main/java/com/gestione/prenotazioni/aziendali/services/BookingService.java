package com.gestione.prenotazioni.aziendali.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import com.gestione.prenotazioni.aziendali.model.Booking;
import com.gestione.prenotazioni.aziendali.repository.BookingRepository;

public class BookingService {

	@Autowired private BookingRepository bookUser;
	
	public Booking getByBooking(Long id) {
		return bookUser.findByUserBooking(001, LocalDate.now());
	}
	
	public Booking createBooking(Booking book) {
		return bookUser.save(book);
	}
	
	public Booking updateBooking(Booking book) {
		return bookUser.getReferenceById(001);
	}
	
	public Booking deleteBooking(Booking book) {
		return bookUser.deleteById(book);
	}
	
	
}
