package decorator.ex1.implementare;

public class PizzaCapriciosa extends APizza{

    @Override
    public String getComponente() {
        return "blat, sos, sunca, ciuperci, masline";
    }

    @Override
    public int getPret() {
        return 40;
    }
}
