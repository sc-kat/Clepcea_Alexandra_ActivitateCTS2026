package observer.ex1.implementare;

public class Membru implements IObserver {
    String nume;

    public Membru(String nume) {
        this.nume = nume;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Notificare pentru membrul " + this.nume + ": " + message);
    }

}
