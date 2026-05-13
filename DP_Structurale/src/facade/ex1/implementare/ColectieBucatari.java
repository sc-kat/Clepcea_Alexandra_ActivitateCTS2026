package facade.ex1.implementare;

import java.util.ArrayList;

public class ColectieBucatari {
    ArrayList<Bucatar> listaBucatari = new ArrayList<>();

    public void addBucatar(Bucatar bucatar) {
        listaBucatari.add(bucatar);
    }

    public int getBucatariLiberi(String data){
        int contor = 0;
        for(Bucatar bucatar : listaBucatari){
            if(bucatar.isEsteLiber()){
                contor++;
            }
        }
        return contor;
    }
}
