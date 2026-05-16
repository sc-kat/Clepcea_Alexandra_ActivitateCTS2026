package proxy.ex4.implementare;

import java.util.ArrayList;

public class ProxyRestaurant implements IRestaurant {
    IRestaurant restaurant;
    ArrayList<Client> listaClienti;

    public ProxyRestaurant(IRestaurant restaurant) {
        this.restaurant = restaurant;
        this.listaClienti = new ArrayList<>();
    }



    @Override
    public void rezervareRestaurant(Client client) {
        listaClienti.add(client);
        if (listaClienti.size() >= 4) {
            System.out.println("S-au strans 4 clienti pentru rezervare. Se fac rezervarile pentru toti clientii din lista.");
            for(Client c: listaClienti) {
                restaurant.rezervareRestaurant(c);
            }

            listaClienti.clear();
        }
    }
}
