import java.util.ArrayList;
import java.util.List;

class IsbnVerifier {
    List<Integer> listaCadena = new ArrayList<>(); 
    int sumas = 0;

    boolean isValid(String stringToVerify) {
        if(stringToVerify.length() > 13 || stringToVerify.length() < 10){
            return false;
        }
        String cadenaLimpia = stringToVerify.replaceAll("-", "");
        if(cadenaLimpia.length() != 10){
            return false;
        }
        for(int i = 0; i < cadenaLimpia.length() -1; i++){
            String letra = String.valueOf(cadenaLimpia.charAt(i));
            if(letra.matches("[0-9]")){
                int numero = Integer.parseInt(String.valueOf(cadenaLimpia.charAt(i)));
                listaCadena.add(numero);
            }else{
                return false;
            }
        }
        if(String.valueOf(cadenaLimpia.charAt(cadenaLimpia.length() - 1)).matches("[0-9]")){
            int numero = Integer.parseInt(String.valueOf(cadenaLimpia.charAt(cadenaLimpia.length() - 1)));
            listaCadena.add(numero);
        }else if(String.valueOf(cadenaLimpia.charAt(cadenaLimpia.length() - 1)).matches("X")){
            int numero = 10;
            listaCadena.add(numero);
        }else{
            return false;
        }
        for(int i = 0; i < listaCadena.size(); i++){
            sumas += listaCadena.get(i) * (10-i);
        }
        return sumas % 11 == 0;
    }
}
