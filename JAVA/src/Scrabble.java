class Scrabble {
    private String palabra;
    private String letra = "";
    private int puntaje = 0;
        
        Scrabble(String word) {
            palabra = word.toUpperCase();
            for(int i = 0; i < palabra.length(); i++){
                letra += palabra.charAt(i);
                if(letra.contains("A")||letra.contains("E") || letra.contains("I") || letra.contains("O") || letra.contains("U") ||letra.contains("L")||letra.contains("N")||letra.contains("R")||letra.contains("S")||letra.contains("T")){
                    puntaje ++;
                    letra = "";
                }else if (letra.contains("D")||letra.contains("G")){
                    puntaje += 2;
                    letra = "";
                }else if (letra.contains("B")||letra.contains("C")||letra.contains("M")||letra.contains("P")){
                    puntaje += 3;
                    letra = "";
                }else if (letra.contains("F")||letra.contains("H")||letra.contains("V")||letra.contains("W")||letra.contains("Y")){
                    puntaje += 4;
                    letra = "";
                }else if (letra.contains("K")){
                    puntaje += 5;
                    letra = "";
                }else if (letra.contains("J")||letra.contains("X")){
                    puntaje += 8;
                    letra = "";
                }else if (letra.contains("Q")||letra.contains("Z")){
                    puntaje += 10;
                    letra = "";
                }
            }
        }
        int getScore() {
            return puntaje;
        }
    }