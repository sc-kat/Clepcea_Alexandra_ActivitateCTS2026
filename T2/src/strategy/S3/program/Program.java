package strategy.S3.program;

import strategy.S3.implementare.*;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Produs p1 = new Produs("Laptop", 3000, true);
        Produs p2 = new Produs("Tableta", 4000, true);
        Produs p3 = new Produs("Telefon", 4500, true);
        Produs p4 = new Produs("Ceas", 2600, false);

        Utilizator utilizator = new Utilizator("Andrei", null);
        utilizator.setStrategieVizualizare(new VizualizarePretCrescator());
//        utilizator.setStrategieVizualizare(new VizualizarePretDescrescator());
//        utilizator.setStrategieVizualizare(new VizualizareProduseCuRecenzii());

        ArrayList<Produs> produse = new ArrayList<>();
        produse.add(p1);
        produse.add(p2);
        produse.add(p3);
        produse.add(p4);

        System.out.println(utilizator.aplicareStrategieProduse(produse));
    }
}
