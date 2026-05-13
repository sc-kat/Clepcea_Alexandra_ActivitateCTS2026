package facade.ex1.implementare;

public class Bucatar {

    private String nume;
    private boolean esteLiber;

    public Bucatar(String nume, boolean esteLiber) {
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
