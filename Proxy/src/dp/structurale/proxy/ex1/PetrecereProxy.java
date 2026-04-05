package dp.structurale.proxy.ex1;

public class PetrecereProxy implements IPetrecere {
    private Petrecere petrecere;

    public PetrecereProxy(Petrecere petrecere) {
        this.petrecere = petrecere;
    }

    @Override
    public void adaugaParticipant(Client client) {
        if(client.getVarsta() >= 18){
            petrecere.adaugaParticipant(client);
        } else {
            System.out.println("Clientul " + client.getNume() + " are sub 18 ani, nu a fost adaugat la petrecere");
        }
    }
}
