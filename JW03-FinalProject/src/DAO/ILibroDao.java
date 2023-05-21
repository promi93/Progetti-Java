package DAO;

import java.util.List;

import MODEL.Libro;

public interface ILibroDao {
    void addLibro(Libro libro);
    void removeLibro(String codiceISBN);
    Libro searchISBN(String codiceISBN);
    List<Libro> searchAutore(String autore);
}
