package observer.ex1.implementare;

import java.util.ArrayList;
import java.util.Observer;

public class SalaFitness implements ISubiect{

    private String numeSala;
    private ArrayList<IObserver> listaObservatori;

    public SalaFitness(String numeSala) {
        this.numeSala = numeSala;
        this.listaObservatori = new ArrayList<>();
    }

    @Override
    public void addObserver(IObserver observer) {
        this.listaObservatori.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.listaObservatori.remove(observer);
    }

    @Override
    public void notifyAll(String mesaj) {
        for (IObserver observer : this.listaObservatori) {
            observer.sendMessage(mesaj);
        }
    }

    public void addCursNou(String cursNou) {
        this.notifyAll("A fost adaugat cursul nou: " + cursNou);
    }

    public void primotieNoua (String promotie) {
        this.notifyAll("Primotie noua: " + promotie);
    }
}
