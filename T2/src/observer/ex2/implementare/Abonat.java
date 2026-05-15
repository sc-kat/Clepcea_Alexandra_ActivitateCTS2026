package observer.ex2.implementare;

public class Abonat implements IObserver {

    private String nume;

    public Abonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void getMesaj(String message) {
        System.out.println("Notificare pentru abonatul " + this.nume + ": " + message);
    }
}
