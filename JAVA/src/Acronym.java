class Acronym {
    private String frase = "";

    Acronym(String phrase) {
        phrase = phrase.replaceAll("-", " ").replaceAll("_", " ");
        char primeraLetra = phrase.charAt(0);
        frase += primeraLetra;
        while (phrase.contains(" ") || phrase.contains("-")) {
                if(phrase.contains(" ") && phrase.contains("-")){
                    if ((phrase.indexOf(" ")) < (phrase.indexOf("-"))) {
                        char letra = phrase.charAt(phrase.indexOf(" ") + 1);
                        frase += letra;
                        phrase = phrase.replaceFirst(" ", "");
                    }else if((phrase.indexOf(" ")) > (phrase.indexOf("-"))){
                        char letra = phrase.charAt(phrase.indexOf("-") + 1);
                        frase += letra;
                        phrase = phrase.replaceFirst("-", "");
                    }
                }else if(!phrase.contains(" ") && phrase.contains("-")){
                    char letra = phrase.charAt(phrase.indexOf("-") + 1);
                    frase += letra;
                    phrase = phrase.replaceFirst("-", "");
                }else if(phrase.contains(" ") && !phrase.contains("-")){
                    char letra = phrase.charAt(phrase.indexOf(" ") + 1);
                    frase += letra;
                    phrase = phrase.replaceFirst(" ", "");
                }else{
                    break;
                }
        }
    }

    String get() {
        return frase.toUpperCase().replaceAll(" ", "");
    }
}