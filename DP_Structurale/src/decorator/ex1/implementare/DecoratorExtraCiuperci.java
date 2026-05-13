package decorator.ex1.implementare;

public class DecoratorExtraCiuperci extends ADecoratorPizza {

    public DecoratorExtraCiuperci(APizza pizza) {
        super(pizza);
    }

    @Override
    public String getComponente() {
        return super.getComponente() + ", extraCiuperci";
    }

    @Override
    public int getPret() {
        return super.getPret() + 5;
    }
}

