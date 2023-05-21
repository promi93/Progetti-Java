package CONTROLLER;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import MODEL.Libro;
import DAO.ICatalogoDao;
import DAO.CatalogoDao;




public class Main {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JW03-FinalProject");
	static EntityManager em = emf.createEntityManager();


	public static void main(String[] args) {
		
		
		 ICatalogoDao pubb = new CatalogoDao();
		
		 try {
		 
			Libro lib = new Libro();
	        lib.setCodiceISBN("978-1234567890");
	        lib.setTitolo("Titolo libro casuale");
	        lib.setAnno_pubblicazione(2021);
	        lib.setNumero_pagine(200);
	        lib.setAutore("Autore del libro");
	        lib.setGenere("Genere del libro");
	        
	        pubb.addElemento(lib);
	        
	        
		 } catch (Exception e) {
			 e.printStackTrace();
		 } finally {
			 em.close();
		 }

	   
	  

	}
	
		

}
