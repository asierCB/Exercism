import java.util.ArrayList;
import java.util.List;

public class KillerSudokuHelper {
    
    List<Integer> listaNumeros = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
    
    List<List<Integer>> combinationsInCage(Integer cageSum, Integer cageSize, List<Integer> exclude) {
        List<Integer> listaCombi = new ArrayList<>();
        List<List<Integer>> listaCombinaciones = new ArrayList<>();
        Integer sizeInicial = cageSize;
        Integer sumaInicial = cageSum;
        
            //Eliminamos los números que estan excluidos de la lista inicial
            for(int i = 0; i < exclude.size(); i++){
                listaNumeros.remove(exclude.get(i));
            }
            //Iniciamos el bucle
            for(int i = 0; i < listaNumeros.size(); i++){
                cageSum -= listaNumeros.get(i);
                if (cageSum < 0 || (cageSum == 0 && cageSize > 1)){
                    cageSum += listaNumeros.get(i);
                    continue;
                }else if(cageSum > 0 && cageSize == 1){
                    cageSum += listaNumeros.get(i);
                    continue;
                }else if(cageSum == 0 && cageSize == 1){
                    listaCombi.add(listaNumeros.get(i));
                    listaCombinaciones.add(listaCombi);
                    
                    listaNumeros.remove(i);

                    //Reseteamos a los valores iniciales para repetir el bucle
                    i = -1;
                    cageSize = sizeInicial;
                    cageSum = sumaInicial;
                    listaCombi = new ArrayList<>();
                }else if(cageSum > 0 && cageSize > 1){
                    listaCombi.add(listaNumeros.get(i));
                    listaNumeros.remove(i);
                    cageSize --;
                    i--;
                }
            }
            return listaCombinaciones;
    }

    List<List<Integer>> combinationsInCage(Integer cageSum, Integer cageSize) {
        return combinationsInCage(cageSum, cageSize, new ArrayList<>()); //Llama al metodo principal sin excluir ningun valor.
    }
}
