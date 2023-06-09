package com.gestione.prenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestione.prenotazioni.model.Booking;
import com.gestione.prenotazioni.repository.BookingRepository;

@Service
public class BookingService {
	
	@Autowired private BookingRepository book;
	
	public List<Booking> getAllReservation() {
		return book.findAll();
	}
	
	public Booking getReservationByID(Long id) {
		return book.findById(id).get();
	}
	
	public Booking createReservation(Booking book1) {
		return book.save(book1);
	}
	
	public Booking updateReservation(Long id, Booking book1) {
		return book.save(book1);
	}
	
	public void deleteReservation(Long id) {
		book.deleteById(id);
	}
	

}
