public class Say {
    private String decirNumero = "";

    public String say(long number) {
        String numero = Long.toString(number);
        // Step 1 de 0 a 99
        


        for(int i = 0; i < numero.length(); i++){
            if(numero.charAt(i) == '0'){
                decirNumero += "zero";
            }else if(numero.charAt(i) == '1'){
                decirNumero += "one";
            }else if(numero.charAt(i) == '2'){
                decirNumero += "two";
            }else if(numero.charAt(i) == '3'){
                decirNumero += "three"; 
            }else if(numero.charAt(i) == '4'){
                decirNumero += "four";
            }else if(numero.charAt(i) == '5'){
                decirNumero += "five";
            }else if(numero.charAt(i) == '6'){
                decirNumero += "six";
            }else if(numero.charAt(i) == '7'){
                decirNumero += "seven";
            }else if(numero.charAt(i) == '8'){
                decirNumero += "eight";
            }else if(numero.charAt(i) == '9'){
                decirNumero += "nine";
            }
        }

        
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
