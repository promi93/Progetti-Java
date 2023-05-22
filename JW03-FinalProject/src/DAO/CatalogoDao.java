package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import JPAUTIL.JpaUtil;
import MODEL.Catalogo;
import MODEL.Libro;

public class CatalogoDao implements ICatalogoDao {
	
    @Override
    public void addElemento(Catalogo elemento) {
    	EntityManager em= JpaUtil.getEntityManagerFactory().createEntityManager();
    	em.getTransaction().begin();
        em.persist(elemento);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void removeElemento(String codiceISBN) {
        Catalogo elemento = searchISBN(codiceISBN);
        EntityManager em= JpaUtil.getEntityManagerFactory().createEntityManager();
        if (elemento != null) {
            em.remove(elemento);
        }
    }

    @Override
    public Catalogo searchISBN(String codiceISBN) {
    	EntityManager em= JpaUtil.getEntityManagerFactory().createEntityManager();
        return em.find(Catalogo.class, codiceISBN);
    }

    @Override
    public List<Catalogo> searchAnnoPubblicazione(int anno_pubblicazione) {
    	EntityManager em= JpaUtil.getEntityManagerFactory().createEntityManager();
        TypedQuery<Catalogo> query = em.createQuery("SELECT e FROM Catalogo e WHERE e.anno_pubblicazione = :anno_pubblicazione", Catalogo.class);
        query.setParameter("annoPubblicazione", anno_pubblicazione);
        return query.getResultList();
    }

    @Override
    public List<Catalogo> searchTitolo(String titolo) {
    	EntityManager em= JpaUtil.getEntityManagerFactory().createEntityManager();
        TypedQuery<Catalogo> query = em.createQuery("SELECT e FROM Catalogo e WHERE e.titolo LIKE :titolo", Catalogo.class);
        query.setParameter("titolo", "%" + titolo + "%");
        return query.getResultList();
    }
}
