package dp.structurale.proxy.ex2;

public class Pestera implements IPestera {

    @Override
    public void permiteAcces(int numarPersoane) {
        System.out.println("Acces permis pentru " + numarPersoane + " persoane in pestera.");
    }
}
