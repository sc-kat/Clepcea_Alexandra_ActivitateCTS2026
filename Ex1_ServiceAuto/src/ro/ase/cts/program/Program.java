package ro.ase.cts.program;

import ro.ase.cts.factory.FabricaMasini;
import ro.ase.cts.factory.TipMasina;
import ro.ase.cts.masini.AMasina;
import ro.ase.cts.service.ServiceAuto;

public class Program {
    public static void main(String[] args) {
        ServiceAuto serviceAuto = ServiceAuto.getInstanta();
        ServiceAuto serviceAuto2 = ServiceAuto.getInstanta();

        System.out.println(serviceAuto == serviceAuto2);

//        serviceAuto.intrareInService(new AMasina("B13AXD", "Skoda") {
//        });
//        serviceAuto.intrareInService(new AMasina("B143AXD", "Fabia") {
//        });
//

        AMasina masina1 = FabricaMasini.getInstance().getMasina(TipMasina.SEDAN,"B43DFG", "Sedanetta");
        AMasina masina2 = FabricaMasini.getInstance().getMasina(TipMasina.SUV, "BV12CDV", "Suvetta");
        AMasina masina3 = FabricaMasini.getInstance().getMasina(TipMasina.VAN, "B25DFG", "Vanetta");
        AMasina masina4 = FabricaMasini.getInstance().getMasina(TipMasina.WAGON, "CT345SDA", "Wagonetta");

        System.out.println("Masina 1: " + masina1);
        System.out.println("Masina 2: " + masina2);
        System.out.println("Masina 3: " + masina3);
        System.out.println("Masina 4: " + masina4);

    }
}
