package dp.structurale.proxy.ex3;

import java.util.ArrayList;

public class Spital implements ISpital {

    ArrayList<String> pacientiVizitati = new ArrayList<>();

    public ArrayList<String> getPacientiVizitati() {
        return pacientiVizitati;
    }

    @Override
    public void accesPermis(String numePacient, int oraVizita) {
        pacientiVizitati.add(numePacient);
        System.out.println("Pacientul " + numePacient + " a primit un vizitator la ora " + oraVizita + ":00.");
    }
}
