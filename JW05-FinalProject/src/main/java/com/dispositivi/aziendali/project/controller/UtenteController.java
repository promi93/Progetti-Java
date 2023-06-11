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
import com.dispositivi.aziendali.project.model.Utente;
import com.dispositivi.aziendali.project.service.UtenteService;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/dipendente")
public class UtenteController {
	
@Autowired UtenteService userService;
	

@PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
	
@GetMapping
	public ResponseEntity<?> getAll(){
		return new ResponseEntity<List<Utente>>(userService.findAllUtente(), HttpStatus.OK);
	}
@PreAuthorize("isAuthenticated()")

	@GetMapping("/{id}")
	public ResponseEntity<?> getUser(@PathVariable Long id){
		return new ResponseEntity<Utente>(userService.findUtenteById(id), HttpStatus.OK);
	}
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping
	public ResponseEntity<?> createUser(@RequestBody Utente user) {
		return new ResponseEntity<Utente>(userService.createUtente(user), HttpStatus.CREATED);

	}	
	
	@PreAuthorize(" hasRole('ADMIN')")
	@PostMapping("/{id}")
	public ResponseEntity<?> addDispositivoToUtente(@RequestBody Dispositivo d,@PathVariable Long id ) {
		return new ResponseEntity<String>(userService.addDispositivoToUente(d, id), HttpStatus.CREATED);

	}
	@PreAuthorize(" hasRole('ADMIN')")
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Long id){
		return new ResponseEntity<String>(userService.removeUtente(id), HttpStatus.OK);

	}
	@PreAuthorize(" hasRole('ADMIN')")
	@PutMapping("/{id}")
	public ResponseEntity<?> updateUser(@RequestBody Utente user) {
		return new ResponseEntity<Utente>(userService.updateUtente(user), HttpStatus.CREATED);

	}
}
