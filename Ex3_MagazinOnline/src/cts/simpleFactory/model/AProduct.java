package cts.simpleFactory.model;

public abstract class AProduct {
    protected double pret;
    protected String nume;

    public AProduct(double pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AProduct{");
        sb.append("pret=").append(pret);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
