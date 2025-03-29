import java.util.List;
import java.util.ArrayList;

class DiamondPrinter {
    private String espacio = " ";

    List<String> printToList(char a) {
        int valorNumerico = (int) a - 65;
        List<String> diamante = new ArrayList<>();//2*valorNumerico - 1);
        
        diamante.add(espacio.repeat(valorNumerico) + "A" + espacio.repeat(valorNumerico));

        if(valorNumerico == 0){
            return diamante;
        }else{
            for(int i = 1; i <= valorNumerico; i++){
                char letra = (char) (i+65);
                diamante.add(espacio.repeat(valorNumerico-i) + letra + espacio.repeat((2*i)-1) + letra + espacio.repeat(valorNumerico-i));
            }
    
            for(int i = valorNumerico -1; i >= 1; i--){
                char letra = (char) (i+65);
                diamante.add(espacio.repeat(valorNumerico-i) + letra + espacio.repeat((2*i)-1) + letra + espacio.repeat(valorNumerico-i));
            }
            diamante.add(espacio.repeat(valorNumerico) + "A" + espacio.repeat(valorNumerico));
        }
        return diamante;
    }
}
