import java.util.ArrayList;
import java.util.List;


class LuhnValidator {
    boolean isValid(String candidate) {
        
//Eliminamos los espacios del número que nos facilitan en la string        
        candidate = candidate.replace(" ", "");
	    List<Integer> numeros = new ArrayList<>();

        if(candidate.length() <= 1){
            return false;
        }
//Devolvemos que el número de la tarjeta es invalido en el caso de que se introduzca algún carácter no numerico
	    for(int i = 0; i <= candidate.length() - 1; i++){
	        if(candidate.charAt(i) == '0' || candidate.charAt(i) == '1' || candidate.charAt(i) == '2'|| 
                candidate.charAt(i) == '3'|| candidate.charAt(i) == '4'|| candidate.charAt(i) == '5'|| 
                candidate.charAt(i) == '6'|| candidate.charAt(i) == '7'|| candidate.charAt(i) == '8'|| 
                candidate.charAt(i) == '9') {
	    		    int num = Integer.parseInt(String.valueOf(candidate.charAt(i)));
		            numeros.add(num);
	    	}else {
                return false;                
	    	}
	    }

        if(numeros.size() <= 1){
            return false;
        }
	    
//Introducimos la condición de que contenga un número par o impar de dígitos para ver por donde empezamos a aplicar el algoritmo de Luhn	    
	    if(numeros.size() % 2 == 0) { // Aquí si es par
	    	for(int i = 0; i <= numeros.size() - 1; i+=2){
	            int num = numeros.get(i)*2;
	            if (num > 9){
	                num = num - 9;
	            }
	            numeros.set(i, num);
		    }
	    }else { // Y aquí si es impar
	    	for(int i = 1; i <= numeros.size() - 1; i+=2){
	            int num = numeros.get(i)*2;
	            if (num > 9){
	                num = num - 9;
	            }
	            numeros.set(i, num);
		    }
	    }
//Una vez realizado el algoritmo de Luhn sumamos todos los términos para comprobar que es dibisible por 10.	    
	    int sumaFinal = 0;
        int i = 0;
        while(i <= numeros.size() - 1){
            sumaFinal += numeros.get(i);
            i++;
        }

        if(sumaFinal % 10 == 0){
        	return true;
        }else{
        	return false;
        }
	}
}