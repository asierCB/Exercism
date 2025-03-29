class ResistorColorTrio {
    private double valor = 0;
    private String respuesta;
    
    String label(String[] colors) {
        if(colors[0] == "black"){
            valor += 0;
        }else if(colors[0] == "brown"){
            valor += 10;
        }else if(colors[0] == "red"){
            valor += 20;
        }else if(colors[0] == "orange"){
            valor += 30;
        }else if(colors[0] == "yellow"){
            valor += 40;
        }else if(colors[0] == "green"){
            valor += 50;
        }else if(colors[0] == "blue"){
            valor += 60;
        }else if(colors[0] == "violet"){
            valor += 70;
        }else if(colors[0] == "grey"){
            valor += 80;
        }else if(colors[0] == "white"){
            valor += 90;
        }

        if(colors[1] == "black"){
            valor += 0;
        }else if(colors[1] == "brown"){
            valor += 1;
        }else if(colors[1] == "red"){
            valor += 2;
        }else if(colors[1] == "orange"){
            valor += 3;
        }else if(colors[1] == "yellow"){
            valor += 4;
        }else if(colors[1] == "green"){
            valor += 5;
        }else if(colors[1] == "blue"){
            valor += 6;
        }else if(colors[1] == "violet"){
            valor += 7;
        }else if(colors[1] == "grey"){
            valor += 8;
        }else if(colors[1] == "white"){
            valor += 9;
        }

        if(colors[2] == "black"){
            valor *= Math.pow(10,0);
        }else if(colors[2] == "brown"){
            valor *= Math.pow(10,1);
        }else if(colors[2] == "red"){
            valor *= Math.pow(10,2);
        }else if(colors[2] == "orange"){
            valor *= Math.pow(10,3);
        }else if(colors[2] == "yellow"){
            valor *= Math.pow(10,4);
        }else if(colors[2] == "green"){
            valor *= Math.pow(10,5);
        }else if(colors[2] == "blue"){
            valor *= Math.pow(10,6);
        }else if(colors[2] == "violet"){
            valor *= Math.pow(10,7);
        }else if(colors[2] == "grey"){
            valor *= Math.pow(10,8);
        }else if(colors[2] == "white"){
            valor *= Math.pow(10,9);
        }

        if(valor > 1000000000){
            valor = valor / 1000000000;
            int valorInt = (int) valor;
            respuesta = valorInt + " gigaohms";
        }else if (valor > 1000000){
            valor = valor/1000000;
            int valorInt = (int) valor;
            respuesta = valorInt + " megaohms";
        }else if (valor > 1000){
            valor = valor / 1000;
            int valorInt = (int) valor;
            respuesta = valorInt + " kiloohms";
        }else{
            int valorInt = (int) valor;
            respuesta = valorInt + " ohms";
        }
        return respuesta;
    }
}
