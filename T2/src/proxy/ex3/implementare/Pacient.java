package proxy.ex3.implementare;

public class Pacient {
    private String name;
    private boolean areAsigurare;

    public Pacient(String name, boolean areAsigurare) {
        this.name = name;
        this.areAsigurare = areAsigurare;
    }

    public String getName() {
        return name;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }
}
