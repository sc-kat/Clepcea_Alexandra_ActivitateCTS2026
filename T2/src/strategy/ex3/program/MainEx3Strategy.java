package strategy.ex3.program;

import strategy.ex3.implementare.Banca;
import strategy.ex3.implementare.Client;
import strategy.ex3.implementare.PersoaneFizice;
import strategy.ex3.implementare.PersoaneJuridice;

public class MainEx3Strategy {
    public static void main(String[] args) {
        Client client = new Client("Gigi");
        Client client1 = new Client("Titi");

        Banca banca = new Banca();
        banca.setMetodaProcesareDocumente(new PersoaneFizice());
        banca.aplicaMetodaProcesare(client);

        banca.setMetodaProcesareDocumente(new PersoaneJuridice());
        banca.aplicaMetodaProcesare(client1);
    }
}
