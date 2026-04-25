package strategy.ex1.implementare;

import java.util.ArrayList;

public class StrategieCaloriiMin implements IProcesabil{

    @Override
    public ProdusDinMeniu alegereMeniu(ArrayList<ProdusDinMeniu> listaProduse) {
        ProdusDinMeniu produsCalMin = listaProduse.get(0);
        for (ProdusDinMeniu p : listaProduse) {
            if(p.getNrCalorii() < produsCalMin.getNrCalorii()){
                produsCalMin = p;
            }
        }
        return produsCalMin;
    }
}
