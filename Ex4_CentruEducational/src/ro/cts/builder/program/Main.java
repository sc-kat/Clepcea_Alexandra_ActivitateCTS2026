package ro.cts.builder.program;

import ro.cts.builder.model.PachetEducational;

public class Main {
    public static void main(String[] args) {
        PachetEducational pachet1 = new PachetEducational.Builder()
                .setDiploma(true)
                .setEvaluareFinala(true)
                .setNumarSedinte(10)
                .build();
        System.out.println(pachet1);
    }
}
