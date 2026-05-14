package strategy.ex1.program;

import strategy.ex1.implementare.*;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Recruiter recruiter = new Recruiter();

        Candidat candidat1 = new Candidat(5, true, true);
        Candidat candidat2 = new Candidat(3, false, true);
        Candidat candidat3 = new Candidat(1, true, false);

        ArrayList<Candidat> candidati = new ArrayList<>();

        candidati.add(candidat1);
        candidati.add(candidat2);
        candidati.add(candidat3);

        recruiter.setMetodaDeEvaluare(new EvaluareExperienta());
        System.out.println("Peste 3 ani: " + recruiter.aplicareMetodaEvaluare(candidati));

        recruiter.setMetodaDeEvaluare(new EvaluareAcceptaRemote());
        System.out.println("Accepta remote: " + recruiter.aplicareMetodaEvaluare(candidati));

        recruiter.setMetodaDeEvaluare(new EvaluareTehnologieCunoscuta());
        System.out.println("Cunosc tehnologia: " + recruiter.aplicareMetodaEvaluare(candidati));



    }
}
