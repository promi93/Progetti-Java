package com.dispositivi.aziendali.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dispositivi.aziendali.project.model.Dispositivo;


@Repository
public interface DispositivoRepository extends JpaRepository<Dispositivo, Long>{

}
