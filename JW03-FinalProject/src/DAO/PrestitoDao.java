package DAO;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import MODEL.Prestito;

public class PrestitoDao implements IPrestitoDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void addPrestito(Prestito prestito) {
        em.persist(prestito);
    }

    @Override
    public void removePrestito(Long id) {
        Prestito prestito = cercaPerId(id);
        if (prestito != null) {
            em.remove(prestito);
        }
    }

    @Override
    public Prestito cercaPerId(Long id) {
        return em.find(Prestito.class, id);
    }

    @Override
    public List<Prestito> searchPrestitiUtente(String numero_tessera) {
        TypedQuery<Prestito> query = em.createQuery("SELECT p FROM Prestito p WHERE p.utente.numero_tessera = :numero_tessera", Prestito.class);
        query.setParameter("numeroTessera", numero_tessera);
        return query.getResultList();
    }

    @Override
    public List<Prestito> searchPrestitiScadutiNonRestituiti() {
        LocalDate oggi = LocalDate.now();
        TypedQuery<Prestito> query = em.createQuery("SELECT p FROM Prestito p WHERE p.data_restituzione_prevista < :oggi AND p.data_restituzione_effettiva IS NULL", Prestito.class);
        query.setParameter("oggi", oggi);
        return query.getResultList();
    }
}
