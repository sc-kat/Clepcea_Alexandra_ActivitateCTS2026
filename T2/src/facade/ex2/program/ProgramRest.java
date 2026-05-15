package facade.ex2.program;

import facade.ex2.implementare.FacadeRestaurant;
import facade.ex2.implementare.Masa;

public class ProgramRest {

    public static void main(String[] args) {
        Masa masa = new Masa(3, true,true,true);
        Masa masa2 = new Masa(5,true,true,false);

        FacadeRestaurant restaurant = new FacadeRestaurant();

        System.out.println("Masa cu nr. " + masa.getNumar() + " este disponibila: "
                + restaurant.verificaDisponibilitateMasa(masa));
        System.out.println("Masa cu nr. " + masa2.getNumar() + " este disponibila: "
                + restaurant.verificaDisponibilitateMasa(masa2));

    }
}
