package strategy.ex2.implementare;

public class Pacient {
    private IMetodaDePlata metodaDePlata;


    public void setMetodaDePlata(IMetodaDePlata metodaDePlata) {
        this.metodaDePlata = metodaDePlata;
    }

    public void aplicaMetodaDePlata(float suma) {
        if (metodaDePlata != null) {
            metodaDePlata.plateste(suma);
        } else {
            throw new UnsupportedOperationException("Nu a fost aleasa o metoda de plata.");
        }
    }
}
