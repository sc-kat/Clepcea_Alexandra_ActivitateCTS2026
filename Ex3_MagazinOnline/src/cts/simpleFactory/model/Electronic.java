package cts.simpleFactory.model;

public class Electronic extends AProduct{
    public Electronic(double pret, String nume) {
        super(pret, nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Electronic{");
        sb.append("pret=").append(pret);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
