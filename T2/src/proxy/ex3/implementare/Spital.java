package proxy.ex3.implementare;

public class Spital implements ISpital {

    @Override
    public void permiteAcces(Pacient pacient) {
        System.out.println("Accesul permis in spital pacientului " + pacient.getName());
    }
}
