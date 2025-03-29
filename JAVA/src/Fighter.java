class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}
class Warrior extends Fighter{
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }
    @Override
    int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()){
            return 10;
        }else{
            return 6;
        }
    }
}

class Wizard extends Fighter{
    private boolean vulnerable = true;
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
    void prepareSpell(){
        vulnerable = false;
    }
    @Override
    boolean isVulnerable() {
        return vulnerable;
    }
    @Override
    int getDamagePoints(Fighter fighter) {
        if (vulnerable == true){
            return 3;
        }else{
            return 12;
        }
    }
}