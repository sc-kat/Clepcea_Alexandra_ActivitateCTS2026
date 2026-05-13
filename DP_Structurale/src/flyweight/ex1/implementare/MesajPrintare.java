package flyweight.ex1.implementare;

public class MesajPrintare implements IPrintare{
    private ETipPrintare tip;
//    private String mesajPrintare;

    MesajPrintare(ETipPrintare tip) {
        this.tip = tip;
        System.out.println("S-a creat bonul cu printare: " + this.tip);
    }

    public ETipPrintare getTip() {
        return tip;
    }

    @Override
    public void printareBon(Bon bon) {
        System.out.println("Bonul pentru masa " + bon.getNrMasa() + " cu cost total " + bon.getCostTotal() +
                " a fost printat cu tipul: " + this.tip);
    }
}
