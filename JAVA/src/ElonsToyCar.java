public class ElonsToyCar {
    int distancia = 0;
    int bateria = 100;
    
    public static ElonsToyCar buy() {
        ElonsToyCar coche1 = new ElonsToyCar();
        return coche1;
    }

    public String distanceDisplay() {
        String distanciaMensaje = "Driven " + distancia + " meters";
        return distanciaMensaje;
    }

    public String batteryDisplay() {
        //String bateriaMensaje =  "Battery at " + bateria + "%";
        //String bateriaAcabada = "Battery empty"
        String bateriaMensaje = (bateria == 0) ? "Battery empty" : "Battery at " + bateria + "%";
        return bateriaMensaje;
    }

    public void drive() {
        if(bateria != 0){
            bateria --;
            distancia += 20; 
        }
    }
}