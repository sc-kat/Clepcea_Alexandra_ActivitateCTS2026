package facade.ex1.program;

import facade.ex1.implementare.Camera;
import facade.ex1.implementare.FacadeHotel;

public class Program {

    public static void main(String[] args) {

        Camera camera = new Camera(101, true, true, true);
        Camera camera2 = new Camera(102, true, false, true);
        FacadeHotel facadeHotel = new FacadeHotel();

        System.out.println("Camera " + camera.getNumar() + " poate fi rezervata: " +
                facadeHotel.verificaDisponibilitateRezervareCamera(camera));

        System.out.println("Camera " + camera2.getNumar() + " poate fi rezervata: " +
                facadeHotel.verificaDisponibilitateRezervareCamera(camera2));
    }
}
