class ResistorColorDuo {
    int value(String[] colors) {
        int valor1;
        int valor2;
        if (colors[0] == "black"){
            valor1 = 0;
        }else if(colors[0] == "brown"){
            valor1 = 10;
        }else if(colors[0] == "red"){
            valor1 = 20;
        }else if(colors[0] == "orange"){
            valor1 = 30;
        }else if(colors[0] == "yellow"){
            valor1 = 40;
        }else if(colors[0] == "green"){
            valor1 = 50;
        }else if(colors[0] == "blue"){
            valor1 = 60;
        }else if(colors[0] == "violet"){
            valor1 = 70;
        }else if(colors[0] == "grey"){
            valor1 = 80;
        }else if(colors[0] == "white"){
            valor1 = 90;
        }else{
            valor1 = -1;
        }

        if (colors[1] == "black"){
            valor2 = 0;
        }else if(colors[1] == "brown"){
            valor2 = 1;
        }else if(colors[1] == "red"){
            valor2 = 2;
        }else if(colors[1] == "orange"){
            valor2 = 3;
        }else if(colors[1] == "yellow"){
            valor2 = 4;
        }else if(colors[1] == "green"){
            valor2 = 5;
        }else if(colors[1] == "blue"){
            valor2 = 6;
        }else if(colors[1] == "violet"){
            valor2 = 7;
        }else if(colors[1] == "grey"){
            valor2 = 8;
        }else if(colors[1] == "white"){
            valor2 = 9;
        }else{
            valor2 = -1;
        }

        return valor1 + valor2;
    }
}