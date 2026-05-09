package command.ex1.program;

import command.ex1.implementare.*;

public class Program {
    public static void main(String[] args) {
        Bucatar bucatar = new Bucatar("Ionica");
        Ospatar ospatar = new Ospatar();

        IComanda comanda1 = new ComandaPaste("Spaghetti Carbonara", bucatar);
        IComanda comanda2 = new ComandaPizza("Prosciuto & Funghi", 3, bucatar);

        ospatar.preiaComanda(comanda1);
        ospatar.preiaComanda(comanda2);

        ospatar.transmiteComenzi();


    }
}
