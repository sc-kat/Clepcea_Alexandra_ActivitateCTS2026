package strategy.ex2.program;

import strategy.ex2.implementare.MetodaPlataCard;
import strategy.ex2.implementare.MetodaPlataCash;
import strategy.ex2.implementare.Pacient;

public class MainMetodaPlata {
    public static void main(String[] args) {
        Pacient pacient = new Pacient();

        pacient.setMetodaDePlata(new MetodaPlataCash());
        pacient.aplicaMetodaDePlata(120);

        pacient.setMetodaDePlata(new MetodaPlataCard());
        pacient.aplicaMetodaDePlata(300);
    }
}
