package decorator.ex1.program;

import decorator.ex1.implementare.ADecoratorPizza;
import decorator.ex1.implementare.APizza;
import decorator.ex1.implementare.DecoratorExtraCiuperci;
import decorator.ex1.implementare.PizzaCapriciosa;

public class ProgramPizzerie {
    public static void main(String[] args) {
        APizza pizza = new PizzaCapriciosa();
        System.out.println("Componente: " + pizza.getComponente());
        System.out.println("Pret: " + pizza.getPret());

        APizza pizzaDecorata = new DecoratorExtraCiuperci(pizza);

        System.out.println("Componente: " + pizzaDecorata.getComponente());
        System.out.println("Pret: " + pizzaDecorata.getPret());
    }
}
