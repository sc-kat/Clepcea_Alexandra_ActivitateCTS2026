package chainOfResponsibility.ex1.program;

import chainOfResponsibility.ex1.implementare.Bucatar;
import chainOfResponsibility.ex1.implementare.BucatarSef;
import chainOfResponsibility.ex1.implementare.Comanda;
import chainOfResponsibility.ex1.implementare.Ospatar;

public class Main {

    public static void main(String[] args) {
        Comanda comanda1 = new Comanda("cola", 1, 5);
        Comanda comanda2 = new Comanda("paste", 2, 17);
        Comanda comanda3 = new Comanda("burger", 1, 98);
        Comanda comanda4 = new Comanda("pizza", 2, 105);

        Ospatar ospatar = new Ospatar();
        Bucatar bucatar = new Bucatar();
        BucatarSef bucatarSef = new BucatarSef();

        ospatar.setNextHandler(bucatar);
        bucatar.setNextHandler(bucatarSef);

        System.out.println("Procesare comanda 1:");
        ospatar.procesareComanda(comanda1);

        System.out.println("\nProcesare comanda 2:");
        ospatar.procesareComanda(comanda2);

        System.out.println("\nProcesare comanda 3:");
        ospatar.procesareComanda(comanda3);

        System.out.println("\nProcesare comanda 4:");
        ospatar.procesareComanda(comanda4);
    }
    }
