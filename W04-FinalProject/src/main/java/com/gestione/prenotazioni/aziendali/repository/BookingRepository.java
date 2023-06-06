package com.gestione.prenotazioni.aziendali.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestione.prenotazioni.aziendali.model.Booking;
import com.gestione.prenotazioni.aziendali.model.User;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUserBooking(User user, LocalDate data_prenotazione);
}
