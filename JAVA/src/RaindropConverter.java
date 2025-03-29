class RaindropConverter {
    private String resultado = "";

    String convert(int number) {
        if(number % 3 == 0){
            resultado += "Pling";
        }
        if(number % 5 == 0){
            resultado += "Plang";
        }
        if(number % 7 == 0){
            resultado += "Plong";
        }
        if(number % 3 != 0 && number % 5 != 0 && number % 7 != 0){
            String numero = String.valueOf(number);
            resultado = numero;
        }

        return resultado;
    }
}