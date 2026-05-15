package facade.ex2.implementare;

public class FacadeRestaurant {
    MasaDebarasata masaDebarasata;
    MasaDisponibila masaDisponibila;
    ServeteleNoi serveteleNoi;

    public FacadeRestaurant() {
        this.masaDebarasata = new MasaDebarasata();
        this.masaDisponibila = new MasaDisponibila();
        this.serveteleNoi = new ServeteleNoi();
    }

    public boolean verificaDisponibilitateMasa(Masa masa){
        return masaDebarasata.esteCurata(masa)
                && masaDisponibila.esteLibera(masa)
                && serveteleNoi.areServeteleNoi(masa);
    }
}
