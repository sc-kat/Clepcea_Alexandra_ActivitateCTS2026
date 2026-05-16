package observer.ex3.program;

import observer.ex3.implementare.Pacient;
import observer.ex3.implementare.Spital;

public class MainEx3Observer {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Mircea");
        Pacient pacient2 = new Pacient("Gigel");
        Pacient pacient3 = new Pacient("Ionel");

        Spital spital = new Spital("NewHorizon");

        spital.addObserver(pacient);
        spital.addObserver(pacient2);
        spital.addObserver(pacient3);

        spital.notificareVirusNou("Virusul X a fost depistat in orasul Y");
        spital.removeObserver(pacient3);
        spital.notifyAll("Masca de protectie este obligatorie in toate spatiile inchise");
    }
}
