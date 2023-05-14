package Progetto.Catalogo.bibliografico;

public class Libro extends ElementoCatalogo {
    private String autore, genere;

    public Libro(String ISBN, String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
        super(ISBN, titolo, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() { return autore; }
    public String getGenere() { return genere; }

    public String toString() {
        return "Libro{" +
            "isbn='" + this.getISBN() + '\'' +
            ", titolo='" + this.getTitolo() + '\'' +
            ", annoPubblicazione=" + this.getPubblicazione() +
            ", numPagine=" + this.getPagine() +
            ", autore='" + this.getAutore() + '\'' +
            ", genere='" + this.getGenere() + '\'' +
        '}';
    }
}
