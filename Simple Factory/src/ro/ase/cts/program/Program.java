package ro.ase.cts.program;

import ro.ase.cts.dispozitive.Dispozitiv;
import ro.ase.cts.factory.FabricaDispozitive;
import ro.ase.cts.factory.TipDispozitiv;

public class Program {
    public static void main(String[] args) {
        FabricaDispozitive fabrica = FabricaDispozitive.getInstance();
        Dispozitiv laptop = fabrica.getDispozitiv(TipDispozitiv.Laptop, 86);
        Dispozitiv telefon = fabrica.getDispozitiv(TipDispozitiv.Smartphone, 73);
        Dispozitiv ceas = fabrica.getDispozitiv(TipDispozitiv.Smartwatch, 23);

        System.out.print(laptop.toString());
        System.out.print(telefon.toString());
        System.out.print(ceas.toString());

        FabricaDispozitive fabrica2 = FabricaDispozitive.getInstance();
    }
}
