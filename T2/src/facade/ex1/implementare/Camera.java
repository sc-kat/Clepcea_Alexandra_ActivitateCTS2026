package facade.ex1.implementare;

public class Camera {
    private int numar;
    private boolean esteCurata;
    private boolean esteLibera;
    private boolean areProsoapeNoi;

    public Camera(int numar, boolean esteCurata, boolean esteLibera, boolean areProsoapeNoi) {
        this.numar = numar;
        this.esteCurata = esteCurata;
        this.esteLibera = esteLibera;
        this.areProsoapeNoi = areProsoapeNoi;
    }

    public int getNumar() {
        return numar;
    }

    public boolean isEsteCurata() {
        return esteCurata;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public boolean isAreProsoapeNoi() {
        return areProsoapeNoi;
    }
}
