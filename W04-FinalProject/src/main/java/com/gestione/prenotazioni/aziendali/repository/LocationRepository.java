package com.gestione.prenotazioni.aziendali.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestione.prenotazioni.aziendali.model.Location;
import com.gestione.prenotazioni.aziendali.model.TypeOfLocation;


@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    List<Location> findByTypeBuildingCity(TypeOfLocation privato);

	Iterable<Location> findByTypeBuildingCity(String string);

	Location findById(String string);

}

