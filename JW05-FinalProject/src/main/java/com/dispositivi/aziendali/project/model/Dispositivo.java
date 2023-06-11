package com.dispositivi.aziendali.project.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "dispositivi")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Dispositivo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private DispositivoAssegnato dispositivoAssegnato;
	
	@Enumerated(EnumType.STRING)
	private StatoDispositivo dispositivoStato;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	private Utente utente;

	public StatoDispositivo getDisponibilita(StatoDispositivo disponibilita) {
		return disponibilita;
	}

	public Dispositivo(DispositivoAssegnato tipoDispositivo, StatoDispositivo statoDispositivo, Utente dipendente2) {
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
