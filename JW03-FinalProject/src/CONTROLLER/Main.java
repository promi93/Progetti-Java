package CONTROLLER;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import MODEL.Libro;
import MODEL.Rivista;
import DAO.ICatalogoDao;
import ENUM.Periodicita;
import DAO.CatalogoDao;




public class Main {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JW03-FinalProject");
	static EntityManager em = emf.createEntityManager();


	public static void main(String[] args) {
		
		
		 ICatalogoDao pubb = new CatalogoDao();
		 
		
		 try {
		 
	        
	        pubb.addElemento(new Libro("Autore", "Genere libro", "codiceISBN", "Titolo libro", 2020,  200));
	        pubb.addElemento(new Rivista("codiceISBN", "Titolo Rivista", 2018, 100, Periodicita.MENSILE));
	        
	        
	        
	        
		 } catch (Exception e) {
			 e.printStackTrace();
		 } finally {
			 em.close();
		 }

	   
	  

	}
	
		

}
