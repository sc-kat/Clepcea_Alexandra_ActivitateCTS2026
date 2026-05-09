package command.ex1.implementare;

public class ComandaPizza implements IComanda {

    private String numePizza;
    private int cantitate;
    private Bucatar bucatar;

    public ComandaPizza(String numePizza, int cantitate, Bucatar bucatar) {
        this.numePizza = numePizza;
        this.cantitate = cantitate;
        this.bucatar = bucatar;
    }

    @Override
    public void prelucreaza() {
       this.bucatar.gatestePizza(numePizza, cantitate);
    }
}
