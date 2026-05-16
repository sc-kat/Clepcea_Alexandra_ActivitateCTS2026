package strategy.ex3.implementare;

public class PersoaneJuridice implements IMetodaProcesareDocumente{
    @Override
    public void metodaProcesare(Client client) {
            System.out.println("Procesare documente pentru persoane juridice, pentru clientul: " + client.getName());
    }
}
