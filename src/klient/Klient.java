package klient;

public class Klient {
    private final String imie;
    private final TypKlienta typKlienta;

    public Klient(String imie, TypKlienta typKlienta) {
        this.imie = imie;
        this.typKlienta = typKlienta;
    }

    public String getImie() {
        return imie;
    }

    public TypKlienta getTypKlienta() {
        return typKlienta;
    }
}