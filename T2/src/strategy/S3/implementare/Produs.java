package strategy.S3.implementare;

public class Produs implements IProdus{
    private String denumire;
    private float pret;
    private boolean areRecenzii;

    public Produs(String nume, float pret, boolean areRecenzii) {
        this.denumire = nume;
        this.pret = pret;
        this.areRecenzii = areRecenzii;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getPret() {
        return pret;
    }

    public boolean isAreRecenzii() {
        return areRecenzii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\nProdus{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", areRecenzii=").append(areRecenzii);
        sb.append('}');
        return sb.toString();
    }
}
