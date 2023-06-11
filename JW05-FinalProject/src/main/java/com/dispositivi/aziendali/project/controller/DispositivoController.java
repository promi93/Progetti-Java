package com.dispositivi.aziendali.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dispositivi.aziendali.project.model.Dispositivo;
import com.dispositivi.aziendali.project.service.DispositivoService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/dispositivo")
public class DispositivoController {
	
@Autowired DispositivoService dispService;
	
@PreAuthorize(" hasRole('MODERATOR') or hasRole('ADMIN')")

@GetMapping
	public ResponseEntity<?> getAll(){
		return new ResponseEntity<List<Dispositivo>>(dispService.findAllDispositivo(), HttpStatus.OK);
	}
@PreAuthorize("isAuthenticated()")
	@GetMapping("/{id}")
	public ResponseEntity<?> getUser(@PathVariable Long id){
		return new ResponseEntity<Dispositivo>(dispService.findDispositivoById(id), HttpStatus.OK);
	}
@PreAuthorize(" hasRole('ADMIN')")

	@PostMapping
	public ResponseEntity<?> createUser(@RequestBody Dispositivo user) {
		return new ResponseEntity<Dispositivo>(dispService.createDispositivo(user), HttpStatus.CREATED);
	}
@PreAuthorize("hasRole('ADMIN')")

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Long id){
		return new ResponseEntity<String>(dispService.removeDispositivo(id), HttpStatus.OK);
	}
@PreAuthorize("hasRole('ADMIN')")

	@PutMapping("/{id}")
	public ResponseEntity<?> updateUser(@RequestBody Dispositivo user) {
		return new ResponseEntity<Dispositivo>(dispService.updateDispositivo(user), HttpStatus.CREATED);
	}
}
