package Progetto.Catalogo.bibliografico;

public class Rivista extends ElementoCatalogo {
    private Periodicita periodicità;

    public enum Periodicita { SETTIMANALE, MENSILE, SEMESTRALE }

    public Rivista(String ISBN, String titolo, int annoPubblicazione, int numPagine, int numR, String period) {
        super(ISBN, titolo, annoPubblicazione, numPagine);
        this.periodicità = Periodicita.valueOf(period);
    }

    public Periodicita getPeriodicita() {
        return periodicità;
    }

    @Override
    public String toString() {
        return "Rivista{" +
                "isbn='" + getISBN() + '\'' +
                ", titolo='" + getTitolo() + '\'' +
                ", annoPubblicazione=" + getPubblicazione() +
                ", numPagine=" + getPagine() +
                ", periodicita=" + periodicità +
                '}';
    }
}
