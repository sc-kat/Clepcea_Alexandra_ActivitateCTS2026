package dp.structurale.proxy.ex3;

public class Program {
    public static void main(String[] args) {
        ISpital spital = new SpitalProxy(new Spital());

        spital.accesPermis("Mihai",17);
        spital.accesPermis("Mihai",19);
        spital.accesPermis("Mihai", 20);
        spital.accesPermis("Ion", 21);
        spital.accesPermis("Maria", 18);
        spital.accesPermis("Ghita", 19);
        spital.accesPermis("Cristi", 20);
    }
}
