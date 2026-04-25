package observer.ex1.program;

import observer.ex1.implementare.Client;
import observer.ex1.implementare.Restaurant;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Gigi");
        Client client2 = new Client("Ionel");
        Client client3 = new Client("Maria");

        Restaurant restaurant = new Restaurant("La Mama");

        restaurant.addObserver(client1);
        restaurant.addObserver(client2);
        restaurant.addObserver(client3);

        restaurant.addProdusInMeniu("Ciorba de burta");

        restaurant.removeObserver(client1);
        restaurant.changePrice("Ciorba de burta", 15.99);
    }
}
