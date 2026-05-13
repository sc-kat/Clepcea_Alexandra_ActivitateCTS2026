package flyweight.ex1.implementare;

import java.util.HashMap;

public class MesajPrintareFactory {
    private static HashMap<ETipPrintare, IPrintare> mesaje = new HashMap<>();
    private static int nrBonuriPrintate = 0;

    public static IPrintare getMesajPrintare(ETipPrintare tipPrintare){
        nrBonuriPrintate++;
        IPrintare mesajPrintare = mesaje.get(tipPrintare);

        if(mesajPrintare == null){
            mesajPrintare = new MesajPrintare(tipPrintare);
            mesaje.put(tipPrintare, mesajPrintare);
        }
        return mesajPrintare;
    }

    public static int getNrBonuriPrintate() {
        return nrBonuriPrintate;
    }

    public static int getNrMatriteBonuri() {
        return mesaje.size();
    }
}
