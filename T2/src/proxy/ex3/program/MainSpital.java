package proxy.ex3.program;

import proxy.ex3.implementare.ISpital;
import proxy.ex3.implementare.Pacient;
import proxy.ex3.implementare.ProxySpital;
import proxy.ex3.implementare.Spital;

public class MainSpital {
    public static void main(String[] args) {
        ISpital spital = new ProxySpital(new Spital());

        Pacient pacient1 = new Pacient("Ion", true);
        Pacient pacient2 = new Pacient("Maria", false);

        spital.permiteAcces(pacient1);
        spital.permiteAcces(pacient2);
    }
}
