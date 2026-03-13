package cts.cl.alex.g.prototype.model;

public class Sticker implements ISticker {

    private String model;
    private int anFabricatie;
    private String dimensiune;

    public Sticker() {
    }

    public Sticker(IMasina masina) {
        this.model = masina.getModel();
        this.anFabricatie = masina.getAnFabricatie();
        this.dimensiune = "Dimensiune pentru anul " + masina.getAnFabricatie() + " si modelul " + masina.getModel();
    }

    @Override
    public ISticker copiere() {
        Sticker sticker = new Sticker();
        sticker.anFabricatie = this.anFabricatie;
        sticker.model = this.model;
        sticker.dimensiune = this.dimensiune;
        return sticker;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sticker{");
        sb.append("model='").append(model).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", dimensiune='").append(dimensiune).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
