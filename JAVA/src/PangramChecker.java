public class PangramChecker {
    public static void main(String[] args) {
        PangramChecker pangramChecker = new PangramChecker();
        System.out.println(pangramChecker.isPangram("The quick brown fox jumps over the lazy dog"));
        System.out.println(pangramChecker.isPangram("a quick movement of the enemy will jeopardize five gunboats"));
    }
    public boolean isPangram(String input) {
        String frase = input.toLowerCase();
        if (frase.contains("a") && frase.contains("b") && frase.contains("c") && frase.contains("d") && frase.contains("e") && frase.contains("f") && frase.contains("g") && frase.contains("h") && frase.contains("i") && frase.contains("j") && frase.contains("k") && frase.contains("l") && frase.contains("m") && frase.contains("n") && frase.contains("o") && frase.contains("p") && frase.contains("q") && frase.contains("r") && frase.contains("s") && frase.contains("t") && frase.contains("u") && frase.contains("v") && frase.contains("w") && frase.contains("x") && frase.contains("y") && frase.contains("z")) {
            return true;
        }else{
            return false;
        }
    }
}

/* MEJOR SOLUCION:
public class PangramChecker {
    public boolean isPangram(String i) {
        return i.toLowerCase().replaceAll("[^a-z]","").chars().distinct().count()==26;
    }
}

.chars() -> convierte la cadena en un IntStream
.distinct() -> elimina los elementos duplicados
 */