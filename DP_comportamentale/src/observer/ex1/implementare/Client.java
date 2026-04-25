package observer.ex1.implementare;

public class Client implements IObserver {
    private String numeClient;

    public Client(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void getMesaj(String mesaj) {
        System.out.println("Clientul " + numeClient + " a primit mesajul: " + mesaj);
    }
}
