package com.gestione.prenotazioni.aziendali.repository;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gestione.prenotazioni.aziendali.model.City;
import com.gestione.prenotazioni.aziendali.model.Location;
import com.gestione.prenotazioni.aziendali.model.TypeOfLocation;

public interface LocationRepository extends JpaRepository<Location, Long>{

	@Query("SELECT post FROM Postazione post where"
			+ " post.edificio.citta = :citta AND post.tipo = :tipo"
			+ " AND post.id NOT IN (SELECT pre.postazione.id FROM Prenotazione pre where pre.dataPrenotata <> :dataRichiesta)")
	public List<Location> findFreeByCity(City city, TypeOfLocation typeOfLocation, LocalDate date_want, List<Location> lib);
	public List<Location> findByBuildingCity(City city, TypeOfLocation typeOfLocation, List<Location> lib);
	public List<Location> findById(String id, List<Location> lib);
}
