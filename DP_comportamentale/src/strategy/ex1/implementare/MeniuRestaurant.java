package strategy.ex1.implementare;

import java.util.ArrayList;

public class MeniuRestaurant {
    private IProcesabil strategieAlegere;
    private ArrayList<ProdusDinMeniu> produse = new ArrayList<>();

    public void addProdusDinMeniu(ProdusDinMeniu produs) {
        this.produse.add(produs);
    }

    public void setStrategieAlegere(IProcesabil strategieAlegere) {
        this.strategieAlegere = strategieAlegere;
    }

    public ProdusDinMeniu alegereProdus(){
        if(this.strategieAlegere != null) {
            return strategieAlegere.alegereMeniu(produse);
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
