package chainOfResponsibility.ex1.implementare;

public class Ospatar extends AHandler {
    @Override
    public void procesareComanda(Comanda comanda) {
        if( comanda.getGradDificultate() <= 5){
            System.out.println("Comanda este procesata de ospatar: " + comanda.getProdus() + " x " + comanda.getCantitate());
        } else {
            System.out.println("Ospatarul nu poate procesa comanda: " + comanda.getProdus() + " x " + comanda.getCantitate() + ". Grad de dificultate prea mare.");
            if(this.getNextHandler() != null) {
                this.getNextHandler().procesareComanda(comanda);
            }
        }
    }
}
