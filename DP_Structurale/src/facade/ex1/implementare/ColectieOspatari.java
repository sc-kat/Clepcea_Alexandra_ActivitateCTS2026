package facade.ex1.implementare;

import java.util.ArrayList;

public class ColectieOspatari {

    private ArrayList<Ospatar> listaOspatari = new ArrayList<>();

    public void addOspatar(Ospatar ospatar) {
        listaOspatari.add(ospatar);
    }

    public int getOspatariLiber(String data) {
        int contor = 0;

        for(Ospatar ospatar : listaOspatari){
            if(ospatar.isEsteLiber()){
                contor++;
            }
        }
        return contor;
    }
}
