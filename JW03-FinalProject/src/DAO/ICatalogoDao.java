package DAO;

import java.util.List;

import MODEL.Catalogo;
import MODEL.Libro;

public interface ICatalogoDao {
    void addElemento(Catalogo catalogo);
    void removeElemento(String codiceISBN);
    Catalogo searchISBN(String codiceISBN);
    List<Catalogo> searchAnnoPubblicazione(int anno_pubblicazione);
    List<Catalogo> searchTitolo(String titolo);
}

