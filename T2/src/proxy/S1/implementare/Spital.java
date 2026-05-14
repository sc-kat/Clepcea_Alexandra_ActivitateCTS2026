package proxy.S1.implementare;

public class Spital implements ISpital {


    @Override
    public void permiteAcces(Vizitator vizitator) {
        System.out.println("Accesul permis in spital vizitatorului " + vizitator.getNume());
    }
}
