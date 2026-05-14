package strategy.ex1.implementare;

import java.util.ArrayList;

public class EvaluareAcceptaRemote implements IMetodaDeEvaluare{
    @Override
    public ArrayList<Candidat> metodaEvaluare(ArrayList<Candidat> listaCandidati) {
        ArrayList<Candidat> candidatiFiltrati = new ArrayList<>();
        for(Candidat candidat : listaCandidati){
            if(candidat.isAcceptaRemote()){
                candidatiFiltrati.add(candidat);
            }
        }
        return candidatiFiltrati;
    }
}
