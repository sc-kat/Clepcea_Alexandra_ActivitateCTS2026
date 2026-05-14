package proxy.S1.implementare;

import java.util.ArrayList;

public class ProxySpital implements ISpital {
    private ISpital spital;
    private ArrayList<Vizitator> listaAsteptare;

    public ProxySpital(ISpital spital) {
        this.spital = spital;
        this.listaAsteptare = new ArrayList<>();
    }

    @Override
    public void permiteAcces(Vizitator vizitator) {

        if (!vizitator.isAreScrisoare()) {
            System.out.println("Accesul nu este permis in spital, vizitatorul " + vizitator.getNume() +
                    " nu are scrisoare de la medic.");
            return;
        }

        listaAsteptare.add(vizitator);
        System.out.println("Vizitatorul " + vizitator.getNume() + " a fost adaugat in lista de asteptare.");

        if (listaAsteptare.size() >= 3) {

            listaAsteptare.forEach(vizitator1 -> {
                vizitator1.setEsteEchipat(true);
                System.out.println("Vizitatorul " + vizitator1.getNume() + " a fost echipat.");
                spital.permiteAcces(vizitator1);
            });
            listaAsteptare.clear();
        } else {
            System.out.println("Accesul nu este permis in spital, sunt prea putini vizitatori in sala de asteptare.");
        }

    }



}
