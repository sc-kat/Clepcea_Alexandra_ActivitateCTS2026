package ro.ase.cts.factory;

import ro.ase.cts.masini.*;

public class FabricaMasini {
    private static FabricaMasini instanta = null;

    private FabricaMasini() {
    }

    public static synchronized FabricaMasini getInstance() {
        if(instanta == null) {
            instanta = new FabricaMasini();
        }
        return instanta;
    }

    public AMasina getMasina(TipMasina tipMasina, String nrInmatriculare, String model) {
        return switch (tipMasina) {
            case TipMasina.SUV -> new Suv(nrInmatriculare, model);
            case TipMasina.VAN -> new Van(nrInmatriculare, model);
            case TipMasina.WAGON -> new Wagon(nrInmatriculare, model);
            case TipMasina.SEDAN -> new Sedan(nrInmatriculare, model);
            default -> null;
        };
    }
}
