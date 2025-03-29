import java.util.List;
import java.util.ArrayList;

class HighScores {
	List<Integer> scoresList = new ArrayList<>();

    public HighScores(List<Integer> highScores) {
        int i = 0;
		while (i < highScores.size()) {
			scoresList.add(highScores.get(i));
			i++;	
		}
    }

    List<Integer> scores() {
        return scoresList;
    }

    Integer latest() {
        return scoresList.getLast();
    }

    Integer personalBest() {
        int i = 0;
        Integer puntMax = 0;
        while(i < scoresList.size()){
            if(scoresList.get(i) > puntMax){
                puntMax = scoresList.get(i);
            }
            i++;
        }
        return puntMax;
    }

    List<Integer> personalTopThree() {
        List<Integer> listaOrdenada = new ArrayList<>(scoresList);
        listaOrdenada.sort(null);
        
	    List<Integer> top3 = new ArrayList<>();
        if(scoresList.size() >= 3){
            for(int i = listaOrdenada.size() - 1; i >= (listaOrdenada.size() - 3); i--){
                top3.add(listaOrdenada.get(i));
            }
        }else if(listaOrdenada.size() == 2){
            for(int i = listaOrdenada.size() - 1; i >= (listaOrdenada.size() - 2); i--){
                top3.add(listaOrdenada.get(i));
            }
        }else if(listaOrdenada.size() == 1){
            top3.add(listaOrdenada.get(0));
        }
        return top3;
    }
}