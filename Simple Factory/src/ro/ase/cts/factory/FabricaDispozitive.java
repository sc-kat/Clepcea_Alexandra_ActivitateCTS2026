package ro.ase.cts.factory;

import ro.ase.cts.dispozitive.Dispozitiv;
import ro.ase.cts.dispozitive.Laptop;
import ro.ase.cts.dispozitive.Smartphone;
import ro.ase.cts.dispozitive.Smartwatch;

import java.util.GregorianCalendar;

public class FabricaDispozitive {

    private static FabricaDispozitive instanta = null;

    private FabricaDispozitive() {
    }

    public static synchronized FabricaDispozitive getInstance() {
        if(instanta == null) {
            instanta = new FabricaDispozitive();
        }
        return instanta;
    }

    public Dispozitiv getDispozitiv(TipDispozitiv tip, int nivelBaterie) {

        return switch(tip){
            case TipDispozitiv.Laptop -> new Laptop(nivelBaterie);
            case TipDispozitiv.Smartphone -> new Smartphone(nivelBaterie);
            case TipDispozitiv.Smartwatch -> new Smartwatch(nivelBaterie);
            default -> null;
        };
    }
}
