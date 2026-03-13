package cts.simpleFactory.model;

public class Accesoriu extends AProduct{
    public Accesoriu(double pret, String nume) {
        super(pret, nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Accesoriu{");
        sb.append("pret=").append(pret);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
