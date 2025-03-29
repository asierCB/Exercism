import java.math.BigDecimal;
import java.math.BigInteger;

public class Grains {
    public static void main (String[] args){
        Grains granos = new Grains();
        
        //System.out.println(granos.grainsOnSquare(65));
        System.out.println(granos.grainsOnSquare(30));
        System.out.println(granos.grainsOnBoard());

    }
    BigInteger grainsOnSquare(final int square) {
        if(square > 0 && square < 65){
            double potenciaEnCasilla = Math.pow(2, (square - 1));
            BigDecimal bigDecimal1 = new BigDecimal(potenciaEnCasilla);
            BigInteger granosCasilla = bigDecimal1.toBigInteger();
            return granosCasilla;
        }else{
            throw new IllegalArgumentException("square must be between 1 and 64");
        }   
    }

    BigInteger grainsOnBoard() {
        int i = 0;
        BigInteger granosTablero = new BigInteger("0");
        while(i < 64){
            double potenciaEnI = Math.pow(2, i);
            BigDecimal bigDecimal2 = new BigDecimal(potenciaEnI);
            BigInteger granosPorCasilla = bigDecimal2.toBigInteger();
            granosTablero = granosTablero.add(granosPorCasilla);
            i++;
        }
        return granosTablero;
    }
}



/* Solucion rápida

import java.math.BigInteger;

public class Grains {

    BigInteger grainsOnSquare(final int square) {

        if (square < 1 || square > 64) throw new IllegalArgumentException("square must be between 1 and 64");

        return BigInteger.valueOf(2).pow(square - 1);
    }

    BigInteger grainsOnBoard() {
        return BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE);
    }

}
 */