package observer.ex3.implementare;

import java.util.ArrayList;

public class Spital implements ISubiect{
    private String numeSpital;
    private ArrayList<IObserver> listaObservatori;

    public Spital(String numeSpital) {
        this.numeSpital = numeSpital;
        this.listaObservatori = new ArrayList<>();
    }

    @Override
    public void addObserver(IObserver observer) {
        listaObservatori.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        listaObservatori.remove(observer);
    }

    @Override
    public void notifyAll(String notificare) {
        for(IObserver observer : listaObservatori){
            observer.getNotificare(notificare);
        }
    }

    public void notificareVirusNou(String notificare){
        this.notifyAll(notificare);
    }
}
