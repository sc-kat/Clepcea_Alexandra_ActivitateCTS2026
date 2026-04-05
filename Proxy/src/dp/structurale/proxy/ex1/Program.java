package dp.structurale.proxy.ex1;

import java.lang.ref.Cleaner;

public class Program {
    public static void main(String[] args) {
        Client client = new Client("Ion", 17);
        Client client1 = new Client("Maria", 18);

        IPetrecere petrecere = new PetrecereProxy(new Petrecere());

        petrecere.adaugaParticipant(client);
        petrecere.adaugaParticipant(client1);
    }
}
