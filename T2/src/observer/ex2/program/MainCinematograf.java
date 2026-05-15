package observer.ex2.program;

import observer.ex2.implementare.Abonat;
import observer.ex2.implementare.Cinematograf;


public class MainCinematograf {
    public static void main(String[] args) {
        Abonat abonat = new Abonat("Ion");
        Abonat abonat2 = new Abonat("Gigel");
        Abonat abonat3 = new Abonat("Costel");

        Cinematograf cinematograf = new Cinematograf("Patria");

        cinematograf.addObserver(abonat);
        cinematograf.addObserver(abonat2);
        cinematograf.addObserver(abonat3);

        cinematograf.promotieBilete("3 la pret de 2");
        cinematograf.adaugareFilmNou("Avatar 2");
        cinematograf.removeObserver(abonat3);
        cinematograf.notifyAll("Programul de functionare al cinematografului a fost prelungit pana la ora 23:00");
    }
}
