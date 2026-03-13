package cts.prototype.model;

public class FisaProdus implements IProductPrototype{

    private String numeProdus;
    private double pret;
    private String categorie;
    private String descriere;

    public FisaProdus() {
    }

    public FisaProdus(String numeProdus, double pret, String categorie, String descriere) {
        this.numeProdus = numeProdus;
        this.pret = pret;
        this.categorie = categorie;
        this.descriere = descriere;
    }

    public void setNumeProdus(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    @Override
    public IProductPrototype cloneaza() {
        FisaProdus fisaProdusCopie = new FisaProdus();
        fisaProdusCopie.numeProdus = this.numeProdus;
        fisaProdusCopie.pret = this.pret;
        fisaProdusCopie.categorie = this.categorie;
        fisaProdusCopie.descriere = this.descriere;

        return fisaProdusCopie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FisaProdus{");
        sb.append("numeProdus='").append(numeProdus).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", categorie='").append(categorie).append('\'');
        sb.append(", descriere='").append(descriere).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
