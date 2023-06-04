package com.gestione.prenotazioni.aziendali.model;

import java.util.HashSet;
import java.util.Set;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String fullName;
	private Boolean booking = true;
	private String password;
	private String email;
	@ManyToMany
	private Set<UserType> function = new HashSet<>();	
	
	
	public User() {
		super();
	}

}
