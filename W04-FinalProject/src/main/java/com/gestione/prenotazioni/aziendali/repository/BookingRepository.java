package com.gestione.prenotazioni.aziendali.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestione.prenotazioni.aziendali.model.Booking;


@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

}
