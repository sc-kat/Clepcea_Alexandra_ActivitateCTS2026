package proxy.S1.implementare;

public class Vizitator {
    private String nume;
    private boolean areScrisoare;
    private  boolean esteEchipat;

    public Vizitator(String nume, boolean areScrisoare, boolean esteEchipat) {
        this.nume = nume;
        this.areScrisoare = areScrisoare;
        this.esteEchipat = esteEchipat;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreScrisoare() {
        return areScrisoare;
    }

    public boolean isEsteEchipat() {
        return esteEchipat;
    }

    public void setEsteEchipat(boolean esteEchipat) {
        this.esteEchipat = esteEchipat;
    }
}
