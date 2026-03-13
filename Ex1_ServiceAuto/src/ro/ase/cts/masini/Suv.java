package ro.ase.cts.masini;

public class Suv extends AMasina{
    public Suv(String numarInmatriculare, String model) {
        super(numarInmatriculare, model);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SUV{");
        sb.append(super.numarInmatriculare).append(" ; ").append(super.model);
        sb.append('}');
        return sb.toString();
    }
}
