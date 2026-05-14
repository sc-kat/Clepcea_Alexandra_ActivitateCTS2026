package observer.ex1.implementare;

public interface ISubiect {

    public void addObserver(IObserver observer);
    public void removeObserver(IObserver observer);
    public void notifyAll(String mesaj);
}
