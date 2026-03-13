package ro.cts.factoryMethod.model;

public abstract class ACourse {
    protected String denumire;

    public ACourse(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ACourse{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
