package DAO;

import java.util.List;
import MODEL.Prestito;

public interface IPrestitoDao {
    void addPrestito(Prestito prestito);
    void removePrestito(Long id);
    Prestito cercaPerId(Long id);
    List<Prestito> searchPrestitiUtente(String numero_tessera);
    List<Prestito> searchPrestitiScadutiNonRestituiti();
}

