package Progetto.Catalogo.bibliografico;


public abstract class ElementoCatalogo {
    private String titolo;
    private String ISBN;
    private int annoPubblicazione;
    private int numeroPagine;


    public ElementoCatalogo(String ISBN, String titolo, int annoPubblicazione, int numeroPagine) {
        this.ISBN = ISBN;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getPubblicazione() {
        return annoPubblicazione;
    }

    public int getPagine() {
        return numeroPagine;
    }
}
