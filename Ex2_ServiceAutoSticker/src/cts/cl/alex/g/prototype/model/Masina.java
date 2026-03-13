package cts.cl.alex.g.prototype.model;

public class Masina implements IMasina{
    protected String model;
    protected int anFabricatie;

    public Masina(String model, int anFabricatie) {
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String getModel() {
        return "";
    }

    @Override
    public int getAnFabricatie() {
        return 0;
    }
}
