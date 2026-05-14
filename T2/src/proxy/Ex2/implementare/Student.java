package proxy.Ex2.implementare;

public class Student {
    private String nume;
    private boolean permisAcces;
    private boolean esteEchipat;

    public Student(String nume, boolean permisAcces) {
        this.nume = nume;
        this.permisAcces = permisAcces;
        this.esteEchipat = false;
    }

    public String getNume() {
        return nume;
    }

    public boolean isPermisAcces() {
        return permisAcces;
    }

    public boolean isEsteEchipat() {
        return esteEchipat;
    }

    public void setEsteEchipat(boolean esteEchipat) {
        this.esteEchipat = esteEchipat;
    }
}
