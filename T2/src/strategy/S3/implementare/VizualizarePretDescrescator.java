package strategy.S3.implementare;

import java.util.ArrayList;

public class VizualizarePretDescrescator implements IVizualizareProduse {
    @Override
    public ArrayList<Produs> procesareProduse(ArrayList<Produs> listaProduse) {
        listaProduse.sort((o1, o2) -> Float.compare(o2.getPret(), o1.getPret()));
        return listaProduse;
    }
}
