package cts.simpleFactory.model;

public class Vestimentar extends AProduct{
    public Vestimentar(double pret, String nume) {
        super(pret, nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vestimentar{");
        sb.append("pret=").append(pret);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
