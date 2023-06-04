package com.gestione.prenotazioni.aziendali.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private Integer numberPeople;
	@ManyToOne
	private Building building;
	private String id_location;
	@Enumerated(EnumType.STRING)
	private TypeOfLocation typeLocation;	
	
}
