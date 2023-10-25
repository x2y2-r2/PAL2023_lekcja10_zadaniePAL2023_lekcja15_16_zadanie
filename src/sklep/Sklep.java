package sklep;

import klient.Klient;
import klient.TypKlienta;

import java.util.List;

public class Sklep {

    //    Metoda ma rzucac wyjatek w przypadku pojawienia sie zlodzieja w sklepie
    public void obsluzKlientow(List<Klient> klienci) throws ZlodziejWSklepieException {
        for (Klient klient : klienci) {
            if (klient.getTypKlienta() == TypKlienta.ZLODZIEJ) {
                    throw new ZlodziejWSklepieException();
                } else {
                    if (klient.getTypKlienta() == TypKlienta.ZWYKLY) {
                        System.out.println("Witaj drogi " + klient.getImie());
                    } else if (klient.getTypKlienta() == TypKlienta.STALY) {
                        System.out.println("Witaj drogi " + klient.getImie());
                        System.out.println("Otrzymujesz znizke 5%!");
                    }
                }
            }
        }
    }