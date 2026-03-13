package ro.ase.cts.masini;

public class Sedan extends AMasina {
    public Sedan(String numarInmatriculare, String model) {
        super(numarInmatriculare, model);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SEDAN{");
        sb.append(super.numarInmatriculare).append(" ; ").append(super.model);
        sb.append('}');
        return sb.toString();
    }
}
