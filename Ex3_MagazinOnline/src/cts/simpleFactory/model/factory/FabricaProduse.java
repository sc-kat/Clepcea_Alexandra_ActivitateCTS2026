package cts.simpleFactory.model.factory;

import cts.simpleFactory.model.*;

public class FabricaProduse {
    public static FabricaProduse instanta = null;

    public FabricaProduse() {
    }

    public static synchronized FabricaProduse getInstanta(){
        if(instanta == null) {
            instanta = new FabricaProduse();
        }
        return instanta;
    }

    public AProduct getProdus(TipProdus tipProdus, double pret, String nume) {
        return switch (tipProdus){
            case ACCESORIU -> new Accesoriu(pret, nume);
            case CARTE -> new Carte(pret, nume);
            case ELECTRONIC -> new Electronic(pret, nume);
            case VESTIMENTAR -> new Vestimentar(pret, nume);
            default -> null;
        };
    }
}
