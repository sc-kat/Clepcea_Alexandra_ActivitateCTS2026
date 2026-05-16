package proxy.ex4.implementare;

public class Restaurant implements IRestaurant {
    @Override
    public void rezervareRestaurant(Client client) {
        System.out.println("Rezervare facuta pentru clientul " + client.getName());
    }
}
