package strategy.ex2.implementare;

public class MetodaPlataCash implements IMetodaDePlata{

    @Override
    public void plateste(float suma) {
        System.out.println("S-a platit cash suma de: " + suma);
    }
}
