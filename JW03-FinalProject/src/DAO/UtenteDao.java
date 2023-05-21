package DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import MODEL.Utenti;

public class UtenteDao implements IUtenteDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void addUtente(Utenti utente) {
        em.persist(utente);
    }

    @Override
    public void removeUtente(String numero_tessera) {
        Utenti utente = searchNumeroTessera(numero_tessera);
        if (utente != null) {
            em.remove(utente);
        }
    }

    @Override
    public Utenti searchNumeroTessera(String numero_tessera) {
        return em.find(Utenti.class, numero_tessera);
    }
}
