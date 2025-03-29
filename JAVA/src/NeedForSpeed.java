class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int battery = 0;
    private int distanceDriven = 0;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    //car = new NeedForSpeed(5, 2);
    
    public boolean batteryDrained() {
        return (battery + batteryDrain > 100);
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if(battery + batteryDrain <= 100){
            distanceDriven += speed;
            battery += batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while(!car.batteryDrained()){
            car.drive();
        }
        return car.distanceDriven() >= this.distance;
    }
}