package chainOfResponsibility.ex1.implementare;

public class Bucatar extends AHandler{

    @Override
    public void procesareComanda(Comanda comanda) {
        if(comanda.getGradDificultate() > 5 && comanda.getGradDificultate() <=100) {
            System.out.println("Comanda este procesata de bucatar: " + comanda.getProdus() + " x " + comanda.getCantitate());
        } else if(comanda.getGradDificultate() <= 5) {
            System.out.println("Comanda nu trebuia sa ajunga la bucatar.");
        } else if (this.getNextHandler() != null) {
            System.out.println("Bucatarul nu poate procesa comanda: " + comanda.getProdus() + " x " + comanda.getCantitate() + ". Grad de dificultate prea mare.");
            this.getNextHandler().procesareComanda(comanda);
        } else {
            System.out.println("Comanda nu poate fi procesata de nimeni.");
        }
    }
}
