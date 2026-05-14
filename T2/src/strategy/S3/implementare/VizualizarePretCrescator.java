package strategy.S3.implementare;

import java.util.ArrayList;

public class VizualizarePretCrescator implements IVizualizareProduse {
    @Override
    public ArrayList<Produs> procesareProduse(ArrayList<Produs> listaProduse) {
       listaProduse.sort((o1, o2) -> Float.compare(o1.getPret(), o2.getPret()));
       return listaProduse;
    }
}
