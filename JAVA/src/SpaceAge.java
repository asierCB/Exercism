class SpaceAge {
    private double segundos;    
    private double añosMercurio = 0.0;
    private double añosVenus = 0.0;
    private double añosTierra = 0.0;
    private double añosMarte = 0.0;
    private double añosJupiter = 0.0;
    private double añosSaturno = 0.0;
    private double añosUrano = 0.0;
    private double añosNeptuno = 0.0;

    

    SpaceAge(double seconds) {
        this.segundos = seconds;
        añosTierra = seconds / 31557600;
        añosMercurio = añosTierra / 0.2408467;
        añosVenus = añosTierra / 0.61519726;
        añosMarte = añosTierra / 1.8808158;
        añosJupiter = añosTierra / 11.862615;
        añosSaturno = añosTierra / 29.447498;
        añosUrano = añosTierra / 84.016846;
        añosNeptuno = añosTierra / 164.79132;
    }

    double getSeconds() {
        return segundos;
    }

    double onEarth() {
        return añosTierra;
    }

    double onMercury() {
        return añosMercurio;
    }

    double onVenus() {
        return añosVenus;
    }

    double onMars() {
        return añosMarte;
    }

    double onJupiter() {
        return añosJupiter;
    }

    double onSaturn() {
        return añosSaturno;
    }

    double onUranus() {
        return añosUrano;
    }

    double onNeptune() {
        return añosNeptuno;
    }

}

