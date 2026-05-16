package strategy.ex3.implementare;

public class PersoaneFizice implements IMetodaProcesareDocumente{
    @Override
    public void metodaProcesare(Client client) {

            System.out.println("Procesare documente pentru persoane fizice, pentru clientul: " + client.getName());
    }
}
