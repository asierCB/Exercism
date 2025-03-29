import java.util.HashSet;
import java.util.Set;

class IsogramChecker {
    boolean isIsogram(String phrase) {
        Set<String> letrasSet = new HashSet<>();
        String frase = phrase.toLowerCase().replaceAll("-", "").replaceAll(" ", "");
        for(int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);
            String letraString = String.valueOf(letra);
            letrasSet.add(letraString);
        }
        return letrasSet.size() == frase.length() ? true : false;
    }
}