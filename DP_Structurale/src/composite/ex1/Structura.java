package composite.ex1;

import java.util.ArrayList;

public class Structura extends ANod{

    private ArrayList<ANod> structura = new ArrayList<>();
    private String numeStructura;

    public Structura(String numeStructura) {
        this.numeStructura = numeStructura;
    }

    @Override
    public String getDenumire() {
        throw new UnsupportedOperationException("Not supported here.");
    }

    @Override
    public int getPret() {
        throw new UnsupportedOperationException("Not supported here.");
    }

    @Override
    public String getInfo() {
        String info = "";
        info += "Structura: " + numeStructura + "\n";
        for(ANod node: structura){
            info += " " + node.getInfo() + "\n";
        }
        return info;
    }

    @Override
    public void adaugaNod(ANod elemStructura) {
        structura.add(elemStructura);
    }

    @Override
    public void stergeNod(ANod elemStructura) {
        structura.remove(elemStructura);
    }

    @Override
    public ANod getNod(int index) {
        return structura.get(index);
    }
}
