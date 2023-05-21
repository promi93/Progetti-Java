package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import MODEL.Libro;

public class LibroDao implements ILibroDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void addLibro(Libro libro) {
        em.persist(libro);
    }

    @Override
    public void removeLibro(String codiceISBN) {
        Libro libro = searchISBN(codiceISBN);
        if (libro != null) {
            em.remove(libro);
        }
    }

    @Override
    public Libro searchISBN(String codiceISBN) {
        return em.find(Libro.class, codiceISBN);
    }

    @Override
    public List<Libro> searchAutore(String autore) {
        TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l WHERE l.autore LIKE :autore", Libro.class);
        query.setParameter("autore", "%" + autore + "%");
        return query.getResultList();
    }
}
