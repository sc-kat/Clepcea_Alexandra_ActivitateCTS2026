package command.ex1.implementare;

public class Bucatar {
    private String numeBucatar;

    public Bucatar(String numeBucatar) {
        this.numeBucatar = numeBucatar;
    }

    public void gatestePizza(String produs, int cantitate) {
        System.out.println(numeBucatar + " gateste " + produs + " x " + cantitate);
    }
    
    public void gatestePaste(String paste) {
        System.out.println(numeBucatar + " gateste " + paste);
    }
}
