import java.util.ArrayList;
import java.util.List;

class Matrix {
    int[][] matrix;
    int cuenta = 0;
    int cuenta2 = 0;

    Matrix(String matrixAsString) {
        String matrizOriginal = matrixAsString;
        //Calculamos el número de filas y columnas para inicializar la matriz
        matrixAsString += '\n';
        for(int i = 0; i < matrixAsString.length(); i++){
            if(matrixAsString.charAt(i) == '\n'){
                //matrixAsString = matrixAsString.substring(0, i) + matrixAsString.substring(i + 1);
                cuenta ++;
            }else if(matrixAsString.charAt(i) == ' '){
                //matrixAsString = matrixAsString.substring(0, i) + matrixAsString.substring(i + 1);
                cuenta2 ++;
            }
        }
        //cuenta = número de filas
        //cuenta2/(cuenta) + 1 = número de columnas
        matrix = new int[cuenta][(cuenta2/cuenta) + 1];
        //Añadimos un salto de línea al final de la cadena para que el bucle for funcione correctamente
        matrizOriginal += '\n';
        //Generamos un Array de Strings con las filas de la matriz
        List<String> filas = new ArrayList<String>();
        for(int i = 0; i < cuenta; i++){
            String frase1 = matrizOriginal.substring(0, matrizOriginal.indexOf('\n'));
            filas.add(frase1 + " ");
            
            frase1 = matrizOriginal.substring(0, matrizOriginal.indexOf('\n') + 1);
            matrizOriginal = matrizOriginal.replaceAll(frase1, "");
        }

        //Añadimos los valores a la matriz con los numeros de la matriz
        for(int i = 0; i < filas.size(); i++){
            String filaNumeros = filas.get(i);
            for(int j = 0; j < ((cuenta2/cuenta) + 1); j++){
                matrix[i][j] = Integer.parseInt(filaNumeros.substring(0, filaNumeros.indexOf(' ')));
                String filaString = filaNumeros.substring(filaNumeros.indexOf(' ') + 1, filaNumeros.length());
                filas.set(i, filaString);
                filaNumeros = filaString;
            }
        }

        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int[] getRow(int rowNumber) {
        int[] filaMatriz = new int[cuenta2/(cuenta) + 1];
        for(int i = 0; i < cuenta2/(cuenta) + 1; i++){
            filaMatriz[i] = matrix[rowNumber][i];
        }
        return filaMatriz;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int[] getColumn(int columnNumber) {
        int[] columnaMatriz = new int[cuenta];
        for(int i = 0; i < cuenta; i++){
            columnaMatriz[i] = matrix[i][columnNumber];
        }
        return columnaMatriz;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getNumber(int rowNumber, int columnNumber) {
        return matrix[rowNumber][columnNumber];
    }

    public static void main(String[] args) {
        String matrixString = "1 2 3\n4 5 6\n7 8 9\n8 7 6";
        int[][] matrix;
        
        /*int cuenta = 0;
        int cuenta2 = 0;
        String matrizOriginal = matrixString;
        //Calculamos el número de filas y columnas para inicializar la matriz
        matrixString += '\n';
        for(int i = 0; i < matrixString.length(); i++){
            if(matrixString.charAt(i) == '\n'){
                //matrixAsString = matrixAsString.substring(0, i) + matrixAsString.substring(i + 1);
                cuenta ++;
            }else if(matrixString.charAt(i) == ' '){
                //matrixAsString = matrixAsString.substring(0, i) + matrixAsString.substring(i + 1);
                cuenta2 ++;
            }
        }
        //cuenta = número de filas
        //cuenta2/(cuenta) + 1 = número de columnas
        matrix = new int[cuenta][cuenta2/(cuenta) + 1];
        //Añadimos un salto de línea al final de la cadena para que el bucle for funcione correctamente
        matrizOriginal += '\n';
        //Generamos un Array de Strings con las filas de la matriz
        List<String> filas = new ArrayList<String>();
        for(int i = 0; i < cuenta; i++){
            String frase1 = matrixString.substring(0, matrixString.indexOf('\n'));
            filas.add(frase1 + " ");
            frase1 = matrixString.substring(0, matrixString.indexOf('\n') + 1);
            matrixString = matrixString.replaceAll(frase1, "");
        }
        System.out.println(filas);
        //Añadimos los valores a la matriz con los numeros de la matriz
        for(int i = 0; i < filas.size(); i++){
            String filaNumeros = filas.get(i);
            for(int j = 0; j < ((cuenta2/cuenta) + 1); j++){
                matrix[i][j] = Integer.parseInt(filaNumeros.substring(0, filaNumeros.indexOf(' ')));
                String filaString = filaNumeros.substring(filaNumeros.indexOf(' ') + 1, filaNumeros.length());
                filas.set(i, filaString);
                filaNumeros = filaString;
            }
        }*/


        Matrix m = new Matrix(matrixString);
        System.out.println(m.getRow(2));
        //System.out.println(m.getNumber(1,1));

        int[] filArray = new int[3];
        filArray[0] = 1;
        filArray[1] = 2;
        filArray[2] = 3;
        System.out.println(filArray[0]);
    }
}