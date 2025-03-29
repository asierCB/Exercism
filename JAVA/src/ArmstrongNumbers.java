import java.util.ArrayList;

public class ArmstrongNumbers {

    public static void main(String[] args) {
        int numberToCheck = 154;
        int originalNumber = numberToCheck;
        int x = 100000000;
        ArrayList<Integer> miArrayList = new ArrayList<>();

        while (x >= 1) { // Condición corregida: x >= 1

            int digit = numberToCheck / x; // Extraer el dígito
            if (digit != 0 || x == 1) { // Procesar el dígito si es distinto de cero o es el último
                System.out.println(numberToCheck + " entre " + x + " es: " + digit);
                numberToCheck = numberToCheck % x; // Usar el operador módulo (%)
                miArrayList.add(digit);
            }

            x = x / 10;

        }
        int[] myArray = miArrayList.stream().mapToInt(i -> i).toArray();
        int sumaTotal = 0;
        
        for (int elemento : myArray) {
        	System.out.println(elemento + " elevado a " + myArray.length +" es: " + Math.pow(elemento, myArray.length));
            //double cubo = Math.pow(5, myArray.length);
            //System.out.println(Math.pow(elemento, myArray.length));
			int potencia = (int) Math.pow(elemento, myArray.length);
			sumaTotal += potencia;
        }
       
        System.out.println(myArray.length);
        
        System.out.println("La suma de todos los términos es: " + sumaTotal);
        if(sumaTotal == originalNumber) {
        	System.out.println("El " + originalNumber + " es igual a: " + sumaTotal + ", es decir, es un"
        			+ " número de Armstrong");
        	//return true; En el caso de definir la clase como: boolean isArmstrongNumber(int numberToCheck) {
        }else {
        	System.out.println("El " + originalNumber + " es distinto a: " + sumaTotal + ", es decir,"
        			+ " no es un número de Armstrong");
        	//return false; En el caso de definir la clase como: boolean isArmstrongNumber(int numberToCheck) {
        }
        

    }

}



/*
Instructions
An Armstrong number is a number that is the sum of its own digits each raised to the power
of the number of digits.

For example:

	- 9 is an Armstrong number, because 9 = 9^1 = 9
	- 10 is not an Armstrong number, because 10 != 1^2 + 0^2 = 1
	- 153 is an Armstrong number, because: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
	- 154 is not an Armstrong number, because: 154 != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190

Write some code to determine whether a number is an Armstrong number.

For more help on how to solve this exercise, please refer to the tutorial provided as 
part of the hello world exercise: instructions.append.md
		
				SOLUCION DE LA COMUNIDAD
		
public class ArmstrongNumbers {

boolean isArmstrongNumber(int numberToCheck) {
// Convert the number to a string to count the number of digits
	String numberAsString = String.valueOf(numberToCheck);
	int numberOfDigits = numberAsString.length();
// Compute the sum of each digit raised to the power of the number of digits
	int sum = 0;
	for (char digitChar : numberAsString.toCharArray()) {
    	int digit = digitChar - '0'; // Convert char to int
    	sum += Math.pow(digit, numberOfDigits);
	}
// Check if the computed sum is equal to the original number
	return sum == numberToCheck;
}
}*/