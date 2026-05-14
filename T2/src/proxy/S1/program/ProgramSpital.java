package proxy.S1.program;

import proxy.S1.implementare.ISpital;
import proxy.S1.implementare.ProxySpital;
import proxy.S1.implementare.Spital;
import proxy.S1.implementare.Vizitator;

public class ProgramSpital {
    public static void main(String[] args) {
        ISpital spital = new ProxySpital(new Spital());


        Vizitator vizitator1 = new Vizitator("Ion", true, true);
        Vizitator vizitator2 = new Vizitator("Mircea", true, true);
        Vizitator vizitator3 = new Vizitator("Gigel", true, true);

        spital.permiteAcces(vizitator1);
        spital.permiteAcces(vizitator2);
        spital.permiteAcces(vizitator3);


    }
}
