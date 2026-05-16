package strategy.ex2.implementare;

public class MetodaPlataCard implements IMetodaDePlata{
    @Override
    public void plateste(float suma) {
        System.out.println("S-a platit cu cardul suma de: " + suma);
    }
}
