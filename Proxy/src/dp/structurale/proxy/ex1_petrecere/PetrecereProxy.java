package dp.structurale.proxy.ex1_petrecere;

public class PetrecereProxy implements IPetrecere {
    private IPetrecere petrecere;

    public PetrecereProxy(IPetrecere petrecere) {
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
