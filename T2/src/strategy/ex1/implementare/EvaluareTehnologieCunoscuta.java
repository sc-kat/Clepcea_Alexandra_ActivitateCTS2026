package strategy.ex1.implementare;

import java.util.ArrayList;

public class EvaluareTehnologieCunoscuta implements IMetodaDeEvaluare{
    @Override
    public ArrayList<Candidat> metodaEvaluare(ArrayList<Candidat> listaCandidati) {
        ArrayList<Candidat> candidatiFiltrati = new ArrayList<>();
        for(Candidat candidat : listaCandidati){
            if(candidat.isCunoscTehnologia()){
                candidatiFiltrati.add(candidat);
            }
        }
        return candidatiFiltrati;
    }
}
