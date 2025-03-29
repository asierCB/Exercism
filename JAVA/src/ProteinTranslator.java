import java.util.List;
import java.util.ArrayList;

class ProteinTranslator {
    private List<String> resultado = new ArrayList<>();
    
    List<String> translate(String rnaSequence) {
        if(rnaSequence.length() % 3 == 0) {
            for (int i = 0; i < rnaSequence.length(); i += 3) {
                resultado.add(rnaSequence.substring(i, i + 3));
            }
        }else{
            if(rnaSequence.length() % 3 == 2){
                rnaSequence += " ";
                for (int i = 0; i < rnaSequence.length(); i += 3) {
                    resultado.add(rnaSequence.substring(i, i + 3));
                }
            }else{
                rnaSequence += "  ";
                for (int i = 0; i < rnaSequence.length(); i += 3) {
                    resultado.add(rnaSequence.substring(i, i + 3));
                }
            }
        }

        for (int i = 0; i < resultado.size(); i++) {
            if(resultado.get(i).equals("AUG")) {
                resultado.remove(i);
                resultado.add(i, "Methionine");
            }else if(resultado.get(i).equals("UUU") || resultado.get(i).equals("UUC")) {
                resultado.remove(i);
                resultado.add(i, "Phenylalanine");
            }else if(resultado.get(i).equals("UUA") || resultado.get(i).equals("UUG")) {
                resultado.remove(i);
                resultado.add(i, "Leucine");
            }else if(resultado.get(i).equals("UCU") || resultado.get(i).equals("UCC") || resultado.get(i).equals("UCA") || resultado.get(i).equals("UCG")) {
                resultado.remove(i);
                resultado.add(i, "Serine");
            }else if(resultado.get(i).equals("UAU") || resultado.get(i).equals("UAC")) {
                resultado.remove(i);
                resultado.add(i, "Tyrosine");
            }else if(resultado.get(i).equals("UGU") || resultado.get(i).equals("UGC")) {
                resultado.remove(i);
                resultado.add(i, "Cysteine");
            }else if(resultado.get(i).equals("UGG")) {
                resultado.remove(i);
                resultado.add(i, "Tryptophan");
            }else if(resultado.get(i).equals("UAA") || resultado.get(i).equals("UAG") || resultado.get(i).equals("UGA")) {
                for (int j = resultado.size() - 1; j >= i; j--) {
                    resultado.remove(j);
                }
            }else{
                throw new IllegalArgumentException("Invalid codon");
            }
        }
        return resultado;
    } 
}