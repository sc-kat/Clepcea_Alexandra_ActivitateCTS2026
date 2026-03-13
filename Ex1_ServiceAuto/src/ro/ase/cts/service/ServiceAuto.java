package ro.ase.cts.service;

import ro.ase.cts.masini.AMasina;

public class ServiceAuto implements IService {

    private AMasina masina;
    private static ServiceAuto instanta = null;

    private ServiceAuto() {
    }

    public static synchronized ServiceAuto getInstanta() {
        if(instanta == null) {
            instanta = new ServiceAuto();
        }
        return instanta;
    }

    @Override
    public void intrareInService(AMasina masina) {
        if(this.masina == null) {
            this.masina = masina;
            System.out.println("Masina cu nr de inmatriculare " + masina.getNumarInmatriculare() + " a intrat in service");
        } else {
            System.out.println("Masina cu nr " + masina.getNumarInmatriculare() + " nu poate intra in service, exista" +
                    " deja o masina in service in acest moment.");
        }

    }

    @Override
    public void iesireDinService() {
        if(this.masina != null) {
            System.out.println("Masina cu nr de inmatriculare " + this.masina.getNumarInmatriculare() +
                    " a iesit din service.");
            this.masina = null;
        } else {
            System.out.println("Nu exista nicio masina in service.");
        }
    }
}
