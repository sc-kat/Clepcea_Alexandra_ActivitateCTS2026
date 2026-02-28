package ro.ase.cts.aplicatii;

public class AplicatieMobila2 {
    private String nume;
    private float dimensiune;
    //Eager initialization
    private static AplicatieMobila2 instanta = new AplicatieMobila2("Aplicatia mea", 20);
    ;

    //cand se genereaza constructorul, acesta este public => de modificat in private
    private AplicatieMobila2(String nume, float dimensiune) {
        this.nume = nume;
        this.dimensiune = dimensiune;
    }

    public static AplicatieMobila2 getInstanta() {
        return instanta;
    }
}

