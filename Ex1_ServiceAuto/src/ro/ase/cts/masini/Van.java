package ro.ase.cts.masini;

public class Van extends AMasina{
    public Van(String numarInmatriculare, String model) {
        super(numarInmatriculare, model);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VAN{");
        sb.append(super.numarInmatriculare).append(" ; ").append(super.model);
        sb.append('}');
        return sb.toString();
    }
}
