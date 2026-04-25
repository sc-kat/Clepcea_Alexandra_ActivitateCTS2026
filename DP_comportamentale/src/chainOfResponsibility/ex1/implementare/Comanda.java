package chainOfResponsibility.ex1.implementare;

public class Comanda {
    private String produs;
    private int cantitate;
    private int gradDificultate;

    public Comanda(String produs, int cantitate, int gradDificultate) {
        this.produs = produs;
        this.cantitate = cantitate;
        this.gradDificultate = gradDificultate;
    }

    public String getProdus() {
        return produs;
    }

    public int getCantitate() {
        return cantitate;
    }

    public int getGradDificultate() {
        return gradDificultate;
    }
}
