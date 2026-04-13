package composite.ex1.refacut;

import java.util.ArrayList;

public class Structura extends ANod implements IStructura {

    private ArrayList<ANod> noduri = new ArrayList<>();
    private String numeStructura;

    public Structura(String numeStructura) {
        this.numeStructura = numeStructura;
    }

    @Override
    public String getInfo(String tab) {
        String info = tab + "Structura: " + numeStructura + "\n";
        for (ANod nod : noduri) {
            info += nod.getInfo(tab + "\t") + "\n";
        }
        return info;
    }

    @Override
    public void adaugaNod(ANod elemStructura) {
        noduri.add(elemStructura);
    }

    @Override
    public void stergeNod(ANod elemStructura) {
        noduri.remove(elemStructura);
    }

    @Override
    public ANod getNod(int index) {
        return noduri.get(index);
    }
}
