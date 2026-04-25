package strategy.ex1.implementare;

import java.util.ArrayList;

public class StrategieCarbohidratiMin implements IProcesabil{
    @Override
    public ProdusDinMeniu alegereMeniu(ArrayList<ProdusDinMeniu> listaProduse) {
        ProdusDinMeniu produsCarbMin = listaProduse.get(0);
        for(ProdusDinMeniu p : listaProduse) {
            if(p.getNrCarbohidrati() < produsCarbMin.getNrCarbohidrati()) {
                produsCarbMin = p;
            }
        }
        return produsCarbMin;
    }
}
