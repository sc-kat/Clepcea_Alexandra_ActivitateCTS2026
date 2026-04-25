package strategy.ex1.implementare;

public class ProdusDinMeniu {
    private String denumireProdus;
    private int nrCalorii;
    private int nrCarbohidrati;

    public ProdusDinMeniu(String denumireProdus, int nrCalorii, int nrCarbohidrati) {
        this.denumireProdus = denumireProdus;
        this.nrCalorii = nrCalorii;
        this.nrCarbohidrati = nrCarbohidrati;
    }

    public String getDenumireProdus() {
        return denumireProdus;
    }

    public int getNrCalorii() {
        return nrCalorii;
    }

    public int getNrCarbohidrati() {
        return nrCarbohidrati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProdusDinMeniu{");
        sb.append("denumireProdus='").append(denumireProdus).append('\'');
        sb.append(", nrCalorii=").append(nrCalorii);
        sb.append(", nrCarbohidrati=").append(nrCarbohidrati);
        sb.append('}');
        return sb.toString();
    }
}
