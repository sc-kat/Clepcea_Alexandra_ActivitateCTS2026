package facade.ex1.implementare;

public class FacadeHotel {

    private VerificaCuratenie verificaCuratenie;
    private VerificaDisponibilitate verificaDisponibilite;
    private VerificaSchimbareProsoape verificaSchimbareProsoape;

    public FacadeHotel() {
        this.verificaCuratenie = new VerificaCuratenie();
        this.verificaDisponibilite = new VerificaDisponibilitate();
        this.verificaSchimbareProsoape = new  VerificaSchimbareProsoape();
    }

    public boolean verificaDisponibilitateRezervareCamera(Camera camera) {
        return this.verificaCuratenie.esteCurata(camera)
                && this.verificaDisponibilite.verificaDisponibilitate(camera)
                && this.verificaSchimbareProsoape.verificaProsoapele(camera);
    }
}
