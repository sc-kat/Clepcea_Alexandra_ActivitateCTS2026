package cts.simpleFactory.model;

public class Carte extends AProduct{
    public Carte(double pret, String nume) {
        super(pret, nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carte{");
        sb.append("pret=").append(pret);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
