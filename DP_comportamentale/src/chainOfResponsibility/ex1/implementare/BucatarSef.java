package chainOfResponsibility.ex1.implementare;

public class BucatarSef extends AHandler{

    @Override
    public void procesareComanda(Comanda comanda) {
        if (comanda.getGradDificultate() > 100) {
            System.out.println("Comanda este procesata de bucatar sef: " + comanda.getProdus() + " x " + comanda.getCantitate());
        }
    }
}
