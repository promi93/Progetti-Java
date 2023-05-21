package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import MODEL.Catalogo;

public class CatalogoDao implements ICatalogoDao {
	
    @PersistenceContext
    private EntityManager em;

    @Override
    public void addElemento(Catalogo elemento) {
    	em.getTransaction().begin();
        em.persist(elemento);
        em.getTransaction().commit();
    }

    @Override
    public void removeElemento(String codiceISBN) {
        Catalogo elemento = searchISBN(codiceISBN);
        if (elemento != null) {
            em.remove(elemento);
        }
    }

    @Override
    public Catalogo searchISBN(String codiceISBN) {
        return em.find(Catalogo.class, codiceISBN);
    }

    @Override
    public List<Catalogo> searchAnnoPubblicazione(int anno_pubblicazione) {
        TypedQuery<Catalogo> query = em.createQuery("SELECT e FROM Catalogo e WHERE e.anno_pubblicazione = :anno_pubblicazione", Catalogo.class);
        query.setParameter("annoPubblicazione", anno_pubblicazione);
        return query.getResultList();
    }

    @Override
    public List<Catalogo> searchTitolo(String titolo) {
        TypedQuery<Catalogo> query = em.createQuery("SELECT e FROM Catalogo e WHERE e.titolo LIKE :titolo", Catalogo.class);
        query.setParameter("titolo", "%" + titolo + "%");
        return query.getResultList();
    }
}
