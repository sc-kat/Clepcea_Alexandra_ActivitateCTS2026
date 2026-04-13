package composite.ex1.refacut;

public class Produs extends ANod {
    private String denumire;
    private int pret;

    public Produs(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public String getInfo(String tab) {
        return tab + "Denumire: " + denumire + ", Pret: " + pret + ".";
    }
}