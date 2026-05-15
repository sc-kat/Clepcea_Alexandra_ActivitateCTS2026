package facade.ex2.implementare;


public class Masa {
    private int numar;
    private boolean esteLibera;
    private boolean esteDebarasata;
    private  boolean areServeteleNoi;

    public Masa(int numar, boolean esteLibera, boolean esteDebarasata, boolean areServeteleNoi) {
        this.numar = numar;
        this.esteLibera = esteLibera;
        this.esteDebarasata = esteDebarasata;
        this.areServeteleNoi = areServeteleNoi;
    }

    public int getNumar() {
        return numar;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public boolean isEsteDebarasata() {
        return esteDebarasata;
    }

    public boolean isAreServeteleNoi() {
        return areServeteleNoi;
    }
}
