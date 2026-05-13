package facade.ex1.implementare;

public class Ospatar {
    private String nume;
    private boolean esteLiber;

    public Ospatar(String nume, boolean esteLiber) {
        this.nume = nume;
        this.esteLiber = esteLiber;
    }

    public String getNume() {
        return nume;
    }

    public boolean isEsteLiber() {
        return esteLiber;
    }
}
