package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import ENUM.Periodicita;
import MODEL.Rivista;

public class RivistaDao implements IRivistaDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void addRivista(Rivista rivista) {
        em.persist(rivista);
    }

    @Override
    public void removeRivista(String codiceISBN) {
        Rivista rivista = searchISBN(codiceISBN);
        if (rivista != null) {
            em.remove(rivista);
        }
    }

    @Override
    public Rivista searchISBN(String codiceISBN) {
        return em.find(Rivista.class, codiceISBN);
    }

    @Override
    public List<Rivista> searchPeriodicita(Periodicita periodicita) {
        TypedQuery<Rivista> query = em.createQuery("SELECT r FROM Rivista r WHERE r.periodicita = :periodicita", Rivista.class);
        query.setParameter("periodicita", periodicita);
        return query.getResultList();
    }
}
