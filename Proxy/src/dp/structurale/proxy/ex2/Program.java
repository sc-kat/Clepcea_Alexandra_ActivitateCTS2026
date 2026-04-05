package dp.structurale.proxy.ex2;

public class Program {
    public static void main(String[] args) {
        IPestera pestera = new PesteraProxy(new Pestera());
        pestera.permiteAcces(4);
        pestera.permiteAcces(5);
        pestera.permiteAcces(3);
    }


}
