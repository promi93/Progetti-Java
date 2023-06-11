package com.dispositivi.aziendali.project.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "dipententi")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Utente {  // classe UTENTE rappresentea DIPENDENTE

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String surname;
	private String username;
	private String email;
	
	@JsonIgnoreProperties("dipendente")
	@OneToMany(mappedBy = "utente",fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	private List<Dispositivo> dispositivi;
	
	public Utente(String username, String email, String name, String surname, List<Dispositivo> dispositivi) {
		super();
		this.username = username;
		this.email = email;
		this.name = name;
		this.surname = surname;
		this.dispositivi = dispositivi;
		this.dispositivi.forEach(e->e.setUtente(this));
	}

	
public void addDisp(Dispositivo d) {
	dispositivi.add(d);
}





}
