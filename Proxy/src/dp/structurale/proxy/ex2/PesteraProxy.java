package dp.structurale.proxy.ex2;

import dp.structurale.proxy.ex1.IPetrecere;

public class PesteraProxy implements IPestera {
    private Pestera pestera;

    public PesteraProxy(Pestera pestera) {
        this.pestera = pestera;
    }

    @Override
    public void permiteAcces(int numarPersoane) {
        if(numarPersoane >= 5){
            pestera.permiteAcces(numarPersoane);
        } else {
            System.out.println("Acces refuzat pentru " + numarPersoane + " persoane in pestera. " +
                    "Numarul minim de persoane este 5.");
        }
    }
}
