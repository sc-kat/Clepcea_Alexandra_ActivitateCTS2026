package ro.ase.cts.masini;

public abstract class AMasina {
    protected String numarInmatriculare;
    protected String model;

    public AMasina(String numarInmatriculare, String model) {
        this.numarInmatriculare = numarInmatriculare;
        this.model = model;
    }

    public String getNumarInmatriculare() {
        return numarInmatriculare;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AMasina{");
        sb.append("numarInmatriculare='").append(numarInmatriculare).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
