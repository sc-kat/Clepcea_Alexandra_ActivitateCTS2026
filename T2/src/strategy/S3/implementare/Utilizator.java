package strategy.S3.implementare;

import java.util.ArrayList;

public class Utilizator {
    private String nume;
    private IVizualizareProduse strategieVizualizare;
//    private ArrayList<Produs> listaProduse;


    public Utilizator(String nume, IVizualizareProduse strategieVizualizare) {
        this.nume = nume;
        this.strategieVizualizare = strategieVizualizare;
    }

    public void setStrategieVizualizare(IVizualizareProduse strategieVizualizare) {
        this.strategieVizualizare = strategieVizualizare;
    }

    public ArrayList<Produs> aplicareStrategieProduse(ArrayList<Produs> listaProduse) {
        if(strategieVizualizare != null) {
            return strategieVizualizare.procesareProduse(listaProduse);
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
