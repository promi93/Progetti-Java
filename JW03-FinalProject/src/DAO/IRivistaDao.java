package DAO;

import java.util.List;

import ENUM.Periodicita;
import MODEL.Rivista;

public interface IRivistaDao {
    void addRivista(Rivista rivista);
    void removeRivista(String codiceISBN);
    Rivista searchISBN(String codiceISBN);
    List<Rivista> searchPeriodicita(Periodicita periodicita);
}
