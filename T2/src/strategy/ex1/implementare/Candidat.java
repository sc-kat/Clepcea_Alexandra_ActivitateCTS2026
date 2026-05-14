package strategy.ex1.implementare;

public class Candidat {

    private int aniExperienta;
    private boolean cunoscTehnologia;
    private boolean acceptaRemote;

    public Candidat(int aniExperienta, boolean cunoscTehnologia, boolean acceptaRemote) {
        this.aniExperienta = aniExperienta;
        this.cunoscTehnologia = cunoscTehnologia;
        this.acceptaRemote = acceptaRemote;
    }

    public int getAniExperienta() {
        return aniExperienta;
    }

    public boolean isCunoscTehnologia() {
        return cunoscTehnologia;
    }

    public boolean isAcceptaRemote() {
        return acceptaRemote;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Candidat{");
        sb.append("aniExperienta=").append(aniExperienta);
        sb.append(", cunoscTehnologia=").append(cunoscTehnologia);
        sb.append(", acceptaRemote=").append(acceptaRemote);
        sb.append("}\n");
        return sb.toString();
    }
}
