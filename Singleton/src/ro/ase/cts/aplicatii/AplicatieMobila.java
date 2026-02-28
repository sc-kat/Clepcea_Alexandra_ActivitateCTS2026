package ro.ase.cts.aplicatii;

public class AplicatieMobila {

    //Lazy initialization
    private String nume;
    private float dimensiune;
    private static AplicatieMobila instanta = null;

    //cand se genereaza constructorul, acesta este public => de modificat in private
    private AplicatieMobila(String nume, float dimensiune) {
        this.nume = nume;
        this.dimensiune = dimensiune;
    }

    public static synchronized AplicatieMobila getInstanta() {
        if (instanta == null) {
            instanta = new AplicatieMobila("Aplicatia mea", 20);
        }
        return instanta;
    }

    public void setNume(String noulNume){
        this.nume = noulNume;
    }

    public String getNume(){
        return this.nume;
    }

}
