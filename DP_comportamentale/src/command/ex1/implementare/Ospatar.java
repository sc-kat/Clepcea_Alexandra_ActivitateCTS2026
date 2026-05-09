package command.ex1.implementare;

import java.util.ArrayList;

public class Ospatar {

    private ArrayList<IComanda> comenzi;

    public Ospatar() {
        this.comenzi = new  ArrayList<>();
    }

    public void preiaComanda(IComanda comanda){
        this.comenzi.add(comanda);
    }

    public void transmiteComenzi(){
        for (IComanda comanda : this.comenzi) {
            comanda.prelucreaza();
        }
        this.comenzi.clear();
    }
}
