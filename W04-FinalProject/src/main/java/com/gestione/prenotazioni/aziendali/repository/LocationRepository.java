package com.gestione.prenotazioni.aziendali.repository;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.gestione.prenotazioni.aziendali.model.City;
import com.gestione.prenotazioni.aziendali.model.Location;
import com.gestione.prenotazioni.aziendali.model.TypeOfLocation;

public interface LocationRepository extends JpaRepository<Location, Long>{

	@Query("SELECT post FROM Postazione post where"
			+ " post.edificio.citta = :citta AND post.tipo = :tipo"
			+ " AND post.id NOT IN (SELECT pre.postazione.id FROM Prenotazione pre where pre.dataPrenotata <> :dataRichiesta)")
	public Page<Location> findFreeByCity(City city, TypeOfLocation typeOfLocation, LocalDate date_want, Pageable pageable);
	public Page<Location> findByBuildingCity(City city, TypeOfLocation typeOfLocation, Pageable pageable);
	public Page<Location> findById(String id, Pageable pageable);
}
