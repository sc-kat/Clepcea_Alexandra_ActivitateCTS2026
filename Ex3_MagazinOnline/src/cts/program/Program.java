package cts.program;

import cts.prototype.model.FisaProdus;
import cts.simpleFactory.model.AProduct;
import cts.simpleFactory.model.factory.FabricaProduse;
import cts.simpleFactory.model.factory.TipProdus;

public class Program {
    public static void main(String[] args) {
        AProduct accesoriu = FabricaProduse.getInstanta().getProdus(TipProdus.ACCESORIU, 14, "Brosa");
        AProduct carte = FabricaProduse.getInstanta().getProdus(TipProdus.CARTE, 13, "Mara");

        System.out.println(accesoriu);
        System.out.println(carte);

        FisaProdus produsModel = new FisaProdus("Bratara", 5.5,
                "Accesoriu", "pentru copii");

        FisaProdus produs1 = (FisaProdus) produsModel.cloneaza();
        produs1.setNumeProdus("Cercei");
        produs1.setPret(6);
        produs1.setDescriere("De aur");

        System.out.println("Produs Model: " + produsModel);
        System.out.println("Produs 1: " + produs1);


    }
}
