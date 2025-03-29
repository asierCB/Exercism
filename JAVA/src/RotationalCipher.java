class RotationalCipher {
    private String abecedario = "abcdefghijklmnopqrstuvwxyz";
    private String abecedarioMayuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String mensajeCodificado = "";
    private int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        for(int i = 0; i < data.length(); i++){
            if(abecedario.contains(data.charAt(i) + "")){
                int numeroPosicion = abecedario.indexOf(data.charAt(i)) + shiftKey;
                if(numeroPosicion >= 26){
                    numeroPosicion = numeroPosicion - 26;
                }
                mensajeCodificado += abecedario.charAt(numeroPosicion);
            }else if(abecedarioMayuscula.contains(data.charAt(i) + "")){
                int numeroPosicion = abecedarioMayuscula.indexOf(data.charAt(i)) + shiftKey;
                if(numeroPosicion >= 26){
                    numeroPosicion = numeroPosicion - 26;
                }
                mensajeCodificado += abecedarioMayuscula.charAt(numeroPosicion);
            }else{
                mensajeCodificado += data.charAt(i);
            }
        }
        return mensajeCodificado;
    }
}