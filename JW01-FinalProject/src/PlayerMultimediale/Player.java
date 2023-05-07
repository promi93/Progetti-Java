package PlayerMultimediale;

public interface Player {
    void play();

    void abbassaVolume();

    void alzaVolume();

    int getVolume();

    void setVolume(int volume);

    int getDurata();

    void setDurata(int durata);
}
