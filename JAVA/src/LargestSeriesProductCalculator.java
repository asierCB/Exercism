import java.util.ArrayList;
import java.util.List;

class LargestSeriesProductCalculator {
    private String inputNumber;
    List<Long> listaNumeros = new ArrayList<>();
    List<Long> listaValores = new ArrayList<>();
    private long numMayor = 0;

    LargestSeriesProductCalculator(String inputNumber) {
        this.inputNumber = inputNumber;
        for(int i = 0; i < inputNumber.length(); i++){
            if(Character.isDigit(inputNumber.charAt(i)) == false){
                throw new IllegalArgumentException("String to search may only contain digits.");
            }
        }
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if(numberOfDigits > inputNumber.length()){
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }else if(numberOfDigits < 0){
            throw new IllegalArgumentException("Series length must be non-negative.");
        }else{
            for(int i = 0; i < inputNumber.length() - numberOfDigits + 1; i++){
                long combinaciones = 1;
                for(int j = i; j < i + numberOfDigits; j++){
                    long temporal = inputNumber.charAt(j) - 48;
                        combinaciones *= temporal;                  
                }
                listaValores.add(combinaciones);
            }
            for(int i = 0; i < listaValores.size(); i++){
                if(listaValores.get(i) > numMayor){
                    numMayor = listaValores.get(i);
                }
            }
            return numMayor;
        }
    }
}