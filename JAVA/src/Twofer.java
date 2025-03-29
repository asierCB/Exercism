public class Twofer {
    public String twofer(String name) {
        String frase = (name == null) ? "One for you, one for me." : "One for " + name + ", one for me.";
        return frase;
    }
}