package observer.ex1.program;

import observer.ex1.implementare.Membru;
import observer.ex1.implementare.SalaFitness;

public class MainSala {
    public static void main(String[] args) {
        Membru m1 = new Membru("Ion");
        Membru m2 = new Membru("Vasile");
        Membru m3 = new Membru("Maria");

        SalaFitness sala = new SalaFitness("AlexFit");
        sala.addObserver(m1);
        sala.addObserver(m2);
        sala.addObserver(m3);

        sala.addCursNou("Yoga");
        sala.primotieNoua("3 luni la pret de 2, pentru cursul de Yoga");
        sala.removeObserver(m2);
        sala.notifyAll("Programul de functionare al salii a fost prelungit pana la ora 22:00");
    }
}
