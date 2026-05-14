package strategy.ex1.implementare;

import java.util.ArrayList;

public class Recruiter {
    IMetodaDeEvaluare metodaDeEvaluare;

    public void setMetodaDeEvaluare(IMetodaDeEvaluare metodaDeEvaluare) {
        this.metodaDeEvaluare = metodaDeEvaluare;
    }

    public ArrayList<Candidat> aplicareMetodaEvaluare(ArrayList<Candidat> listaCandidati) {
        if(metodaDeEvaluare!=null){
            return metodaDeEvaluare.metodaEvaluare(listaCandidati);
        } else {
            throw new UnsupportedOperationException("Metoda de evaluare nu a fost setata.");
        }
    }
}
