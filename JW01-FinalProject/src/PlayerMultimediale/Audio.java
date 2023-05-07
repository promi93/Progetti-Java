package PlayerMultimediale;

public class Audio extends ElementoMultimediale implements Player {
    protected int volume;
    protected int durata;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;

    }

    public int getDurata() {
        return durata;
    }


    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
    	return volume;
    }
    
    
    @Override
    public void abbassaVolume() {
        volume--;

    }


    @Override
    public void alzaVolume() {
        volume++;
    }

    @Override
    public void play() {

        for (int i = 0; i < getDurata(); i++) {
            System.out.print(getTitolo() + ", volume: ");
            for (int y = 0; y < getVolume(); y++) {
  
            }
            System.out.println();
        }
    }
}
