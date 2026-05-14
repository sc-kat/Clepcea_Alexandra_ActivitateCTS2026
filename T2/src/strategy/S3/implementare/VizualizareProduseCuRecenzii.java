package strategy.S3.implementare;

import java.util.ArrayList;

public class VizualizareProduseCuRecenzii implements IVizualizareProduse {

    @Override
    public ArrayList<Produs> procesareProduse(ArrayList<Produs> listaProduse) {
        ArrayList<Produs> listaProduseCuRecenzii = new ArrayList<>();
        for(Produs produs: listaProduse) {
            if(produs.isAreRecenzii()) {
                listaProduseCuRecenzii.add(produs);
            }
        }
        return listaProduseCuRecenzii;
    }
}
