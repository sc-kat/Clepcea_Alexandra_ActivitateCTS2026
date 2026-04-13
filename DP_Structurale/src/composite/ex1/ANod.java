package composite.ex1;

public abstract class ANod {
    public abstract String getDenumire();
    public abstract int getPret();

    public String getInfo() {
        return "Denumire: " + this.getDenumire() + ", Pret: " + this.getPret() + ".";
    }

    public void adaugaNod(ANod elemStructura){
        throw new UnsupportedOperationException("Not supported here.");
    }

    public void stergeNod(ANod elemStructura){
        throw new UnsupportedOperationException("Not supported here.");
    }

    public ANod getNod(int index) {
        throw new UnsupportedOperationException("Not supported here.");
    }
}
