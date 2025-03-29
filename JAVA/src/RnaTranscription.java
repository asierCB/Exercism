class RnaTranscription {
    private String rna = "";

    String transcribe(String dnaStrand) {
        int i = 0;
        while(i < dnaStrand.length()){
            if(dnaStrand.charAt(i) == 'G'){
                rna += "C";
            }else if(dnaStrand.charAt(i) == 'C'){
                rna += "G";
            }else if(dnaStrand.charAt(i) == 'T'){
                rna += "A";
            }else if(dnaStrand.charAt(i) == 'A'){
                rna += "U";
            }
            i++;
        }
        return rna;
    }
}