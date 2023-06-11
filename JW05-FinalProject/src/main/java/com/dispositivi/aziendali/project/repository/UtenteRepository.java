package com.dispositivi.aziendali.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dispositivi.aziendali.project.model.Utente;



@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long>{
	public List<Utente> findByNome(String nome);
}
