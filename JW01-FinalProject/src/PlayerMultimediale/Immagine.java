package PlayerMultimediale;

class Immagine extends ElementoMultimediale implements RegolazioneLuminosità {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int l) {
        this.luminosita = l;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita--;
    }

    public void show() {
        System.out.print(getTitolo() + " luminosità: ");
    }
}
