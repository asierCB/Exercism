import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> coleccion = new HashSet<String>();
        for(int i = 0; i < cards.size(); i++){
            coleccion.add(cards.get(i));
        }
        return coleccion;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if(myCollection.size() != 0 && theirCollection.size() != 0){
            if(myCollection.containsAll(theirCollection) || theirCollection.containsAll(myCollection)){
                return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        if(collections.size() == 1){
            return collections.get(0);
        }else{
            Iterator<String> iterador = collections.get(0).iterator();
            Set<String> coleccion = new HashSet<String>();
            int cuenta = 0;
            
            while(iterador.hasNext()){
                String carta = iterador.next();
                for(int i = 0; i < collections.size(); i++){
                    if(collections.get(i).contains(carta)){
                        cuenta ++;
                    }
                    if(cuenta == collections.size()){
                        coleccion.add(carta);
                    }
                }
            }
            return coleccion;
        }
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> coleccion = new HashSet<String>();

        for(int i = 0; i < collections.size(); i++){
            Iterator<String> iterador = collections.get(i).iterator();
            while(iterador.hasNext()){
                String carta = iterador.next();
                coleccion.add(carta);
            }
        }
        return coleccion;
    }
}