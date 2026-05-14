package strategy.ex1.implementare;

import java.util.ArrayList;

public class EvaluareExperienta implements IMetodaDeEvaluare{
    @Override
    public ArrayList<Candidat> metodaEvaluare(ArrayList<Candidat> listaCandidati) {
        ArrayList<Candidat> candidatiFiltrati = new ArrayList<>();
        for(Candidat candidat : listaCandidati){
            if(candidat.getAniExperienta() >= 3){
                candidatiFiltrati.add(candidat);
            }
        }
        return candidatiFiltrati;
    }

}
