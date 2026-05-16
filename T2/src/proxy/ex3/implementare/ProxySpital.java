package proxy.ex3.implementare;

public class ProxySpital implements ISpital {
    private ISpital spital;

    public ProxySpital(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void permiteAcces(Pacient pacient) {

        if(pacient.isAreAsigurare()){
            System.out.println("Are asigurare, accesul este permis in spital pacientului " + pacient.getName());
        } else {
            System.out.println("Nu are asigurare, accesul este refuzat in spital pacientului " + pacient.getName());
        }
    }
}
