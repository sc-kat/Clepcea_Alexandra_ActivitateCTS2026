package flyweight.ex1.program;

import flyweight.ex1.implementare.Bon;
import flyweight.ex1.implementare.ETipPrintare;
import flyweight.ex1.implementare.MesajPrintareFactory;

public class ProgramBonuri {
    public static void main(String[] args) {
        Bon bon = new Bon(4, 320);
        for (int i = 0; i < 20; i++) {
            MesajPrintareFactory.getMesajPrintare(ETipPrintare.TIP2).printareBon(bon);
        }

        System.out.println(MesajPrintareFactory.getNrBonuriPrintate() + " bonuri printate");
        System.out.println(MesajPrintareFactory.getNrMatriteBonuri() + " matrite bonuri folosite");
    }
}
