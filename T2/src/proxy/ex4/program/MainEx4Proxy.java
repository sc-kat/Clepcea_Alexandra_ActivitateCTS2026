package proxy.ex4.program;

import proxy.ex4.implementare.Client;
import proxy.ex4.implementare.IRestaurant;
import proxy.ex4.implementare.ProxyRestaurant;
import proxy.ex4.implementare.Restaurant;

public class MainEx4Proxy {
    public static void main(String[] args) {
        IRestaurant restaurant = new ProxyRestaurant(new Restaurant());

        Client client = new Client("Ion");
        Client client1 = new Client("Maria");
        Client client2 = new Client("Gigel");
        Client client3 = new Client("Iulia");

        restaurant.rezervareRestaurant(client);
        restaurant.rezervareRestaurant(client1);
        restaurant.rezervareRestaurant(client2);
        restaurant.rezervareRestaurant(client3);
    }
}
