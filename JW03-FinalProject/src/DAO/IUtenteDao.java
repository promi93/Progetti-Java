package DAO;

import MODEL.Utenti;

public interface IUtenteDao {
    void addUtente(Utenti utente);
    void removeUtente(String numero_tessera);
    Utenti searchNumeroTessera(String numero_tessera);
}
