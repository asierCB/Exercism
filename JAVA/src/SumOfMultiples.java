import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class SumOfMultiples {
    private Set<Integer> multiplos = new HashSet<Integer>();

    SumOfMultiples(int number, int[] set) {
        for(int i = 0; i < set.length; i++){
            int numero = set[i];
            if(set[i] > 0){
                while(number > numero){
                    multiplos.add(numero);
                    numero += set[i];
                }
            }
        }
    }

    int getSum() {
        int suma = 0;
        Iterator<Integer> iterador = multiplos.iterator();
        while (iterador.hasNext()) {
            suma += iterador.next();
        }
        return suma;
    }
}
