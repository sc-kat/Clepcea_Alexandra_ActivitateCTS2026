package strategy.S3.implementare;

import java.util.ArrayList;

public class VizualizareProduseCuRecenzii implements IVizualizareProduse {
    ArrayList<Produs> listaProduseCuRecenzii = new ArrayList<>();
    @Override
    public ArrayList<Produs> procesareProduse(ArrayList<Produs> listaProduse) {
        for(Produs produs: listaProduse) {
            if(produs.isAreRecenzii()) {
                listaProduseCuRecenzii.add(produs);
            }
        }
        return listaProduseCuRecenzii;
    }
}
