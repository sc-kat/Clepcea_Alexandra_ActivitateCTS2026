package dp.structurale.proxy.ex3_spital;

public class SpitalProxy implements ISpital {
    private Spital spital;

    public SpitalProxy(Spital spital) {
        this.spital = spital;
    }

    @Override
    public void accesPermis(String numePacient, int oraVizita) {
        if(oraVizita < 18 || oraVizita > 20) {
            System.out.println("Acces interzis la spital pentru vizita, la ora " + oraVizita + ":00. " +
                    "Vizitele sunt permise doar intre orele 18:00 si 20:00.");
        } else if (spital.getPacientiVizitati().contains(numePacient)) {
            System.out.println("Acces interzis la spital pentru vizita. Pacientul " + numePacient + " a primit " +
                    "deja un vizitator astazi.");
        } else {
            spital.accesPermis(numePacient, oraVizita);

        }
    }
}
