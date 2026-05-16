package strategy.ex3.implementare;

public class Banca {
    private IMetodaProcesareDocumente metodaProcesareDocumente;


    public void setMetodaProcesareDocumente(IMetodaProcesareDocumente metodaProcesareDocumente) {
        this.metodaProcesareDocumente = metodaProcesareDocumente;
    }

    public void aplicaMetodaProcesare(Client client) {
        if(this.metodaProcesareDocumente != null) {
            metodaProcesareDocumente.metodaProcesare(client);
        } else {
            throw new UnsupportedOperationException("Nu a fost aleasa o metoda de procesare");
        }
    }
}
