package composite.ex1.refacut;

public class Meniu {
    private Structura structura;
    private String numeRestaurant;

    public Meniu(Structura structura, String numeRestaurant) {
        this.structura = structura;
        this.numeRestaurant = numeRestaurant;
    }

    public Structura getStructura() {
        return structura;
    }

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    public void setNumeRestaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }
}