package observer.ex3.implementare;

public class Pacient implements IObserver {
    private String numePacient;


    public Pacient(String numePacient) {
        this.numePacient = numePacient;
    }

    @Override
    public void getNotificare(String notificare) {
        System.out.println("Pacientul " + numePacient + " a primit notificarea: " + notificare);
    }
}
