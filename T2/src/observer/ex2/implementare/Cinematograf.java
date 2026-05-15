package observer.ex2.implementare;

import java.util.ArrayList;
import java.util.Observer;

public class Cinematograf implements ISubiect {

    private String numeCinematograf;
    private ArrayList<IObserver> listaObserveri;

    public Cinematograf(String numeCinematograf) {
        this.numeCinematograf = numeCinematograf;
        this.listaObserveri = new ArrayList<>();
    }

    @Override
    public void addObserver(IObserver observer) {
        listaObserveri.add(observer);

    }

    @Override
    public void removeObserver(IObserver observer) {
        listaObserveri.remove(observer);
    }

    @Override
    public void notifyAll(String message) {
        for (IObserver observer : listaObserveri) {
            observer.getMesaj(message);
        }
    }

    public void adaugareFilmNou(String numeFilmNou){
        this.notifyAll("A fost adaugat filmul nou: " + numeFilmNou);
    }

    public void promotieBilete(String promotie){
        this.notifyAll("Promotie: " + promotie);
    }

}
