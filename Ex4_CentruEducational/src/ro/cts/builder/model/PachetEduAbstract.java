package ro.cts.builder.model;

public interface PachetEduAbstract {

    PachetEduAbstract setNumarSedinte(int numarSedinte);
    PachetEduAbstract setDiploma(boolean diploma);
    PachetEduAbstract setEvaluareFinala(boolean evaluareFinala);

    PachetEducational build();

}
