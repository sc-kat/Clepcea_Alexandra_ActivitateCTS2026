package dp.structurale.proxy.ex1;

public class Petrecere implements IPetrecere {
    @Override
    public void adaugaParticipant(Client client) {
        System.out.println("Adaugam clientul " + client.getNume() + " la petrecere");
    }
}
