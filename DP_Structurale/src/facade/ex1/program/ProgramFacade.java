package facade.ex1.program;

import facade.ex1.implementare.Bucatar;
import facade.ex1.implementare.FacadeRestaurant;
import facade.ex1.implementare.Ospatar;

public class ProgramFacade {
    public static void main(String[] args) {
        FacadeRestaurant facade = new FacadeRestaurant();

        facade.addBucatar(new Bucatar("Popescu Ion", true));
        facade.addBucatar(new Bucatar("Ionescu Vasile", false));
        facade.addBucatar(new Bucatar("Georgescu Maria", true));

        facade.addOspatar(new Ospatar("Marin Elena", true));
        facade.addOspatar(new Ospatar("Dumitrescu Andrei", true));
        facade.addOspatar(new Ospatar("Dumitrescu Maria", true));

        System.out.println("Se poate face rezervare pentru 50 de persoane pe data de 2024-06-15? " +
                facade.verificaDisponibilitateRestData("2024-06-15", 50));
        System.out.println("Se poate face rezervare pentru 35 de persoane pe data de 2024-06-15? " +
                facade.verificaDisponibilitateRestData("2024-06-15", 15));
    }
}
