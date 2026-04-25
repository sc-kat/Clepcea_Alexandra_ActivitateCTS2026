package observer.ex1.implementare;

import java.util.ArrayList;

public class Restaurant implements ISubiect {
    private String numeRestaurant;
    ArrayList<IObserver> clienti = new ArrayList<>();

    public Restaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.clienti = clienti;
    }

    @Override
    public void addObserver(IObserver observer) {
        clienti.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        clienti.remove(observer);
    }

    @Override
    public void notifyAll(String mesaj) {
        for (IObserver o : clienti) {
            o.getMesaj(mesaj);
        }
    }

    public void addProdusInMeniu(String produs){
        this.notifyAll("A fost adaugat un nou produs in meniu: " + produs);
    }

    public void changePrice(String produs, double pretRedus) {
        this.notifyAll("A fost redus pretul produslui: " + produs + ", la " + pretRedus);
    }
}
