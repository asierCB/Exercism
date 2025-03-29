import java.util.ArrayList;
import java.util.List;

class PrimeCalculator {
    List<Integer> listaPrimos = new ArrayList<Integer>();    

    int nth(int nth) {
        listaPrimos.add(1);
        listaPrimos.add(2);
        int cuenta = 0;
        //Quitamos los numeros negativos de las comprobaciones
        if(nth < 1){
            throw new IllegalArgumentException();
        }
        //Creamos una lista de los números primos con paso +2 para descontar directamente los pares
        //y así reducir el tiempo de ejecución
        for(int i = 3; i < 110000; i += 2){
            for(int j = 1; j < listaPrimos.size(); j++){
                if(i % listaPrimos.get(j) == 0){
                    cuenta++;
                }
            }
            if(cuenta == 0){
                listaPrimos.add(i);
            }
            cuenta = 0;
        }
        //Pedimos que devuelva el número primo de la posición solicitada 
        return listaPrimos.get(nth);
    }
}