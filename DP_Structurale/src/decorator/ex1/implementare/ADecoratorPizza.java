package decorator.ex1.implementare;

public abstract class ADecoratorPizza extends APizza{
    APizza pizza;

    public ADecoratorPizza(APizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getComponente() {
        return pizza.getComponente();
    }

    @Override
    public int getPret() {
        return pizza.getPret();
    }
}
