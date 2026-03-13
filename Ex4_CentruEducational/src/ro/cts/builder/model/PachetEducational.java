package ro.cts.builder.model;

public class PachetEducational {
    private int numarSedinte;
    private boolean diploma;
    private boolean evaluareFinala;

    public PachetEducational(int numarSedinte, boolean diploma, boolean evaluareFinala) {
        this.numarSedinte = numarSedinte;
        this.diploma = diploma;
        this.evaluareFinala = evaluareFinala;
    }

    public static class Builder implements PachetEduAbstract {
        private int numarSedinte;
        private boolean diploma;
        private boolean evaluareFinala;

        @Override
        public PachetEduAbstract setNumarSedinte(int numarSedinte) {
            this.numarSedinte = numarSedinte;
            return this;
        }

        @Override
        public PachetEduAbstract setDiploma(boolean diploma) {
            this.diploma = diploma;
            return this;
        }

        @Override
        public PachetEduAbstract setEvaluareFinala(boolean evaluareFinala) {
            this.evaluareFinala = evaluareFinala;
            return this;
        }

        @Override
        public PachetEducational build() {
            return new PachetEducational(numarSedinte, diploma, evaluareFinala);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetEducational{");
        sb.append("numarSedinte=").append(numarSedinte);
        sb.append(", diploma=").append(diploma);
        sb.append(", evaluareFinala=").append(evaluareFinala);
        sb.append('}');
        return sb.toString();
    }
}
