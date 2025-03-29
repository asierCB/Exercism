import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class DnDCharacter {
	private int fuerza;
    private int destreza;
    private int constitucion;
    private int inteligencia;
    private int sabiduria;
    private int carisma;
    private int hitpoints;

	public DnDCharacter() {
        fuerza = ability(rollDice());
        destreza = ability(rollDice());
        constitucion = ability(rollDice());
        inteligencia = ability(rollDice());
        sabiduria = ability(rollDice());
        carisma = ability(rollDice());
        hitpoints = 10 + modifier(constitucion);
    }
	
	int ability(List<Integer> scores) {
        int sum=0;
        for (int i: scores) {
            sum+=i;
        }
        return sum - Collections.min(scores);
    }

    List<Integer> rollDice() {
    	Random rd = new Random();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            res.add(rd.nextInt(6)+1);
        }
        return res;
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10)/2.0);
    }

    int getStrength() {
        return fuerza;
    }

    int getDexterity() {
        return destreza;
    }

    int getConstitution() {
        return constitucion;
    }

    int getIntelligence() {
        return inteligencia;
    }

    int getWisdom() {
        return sabiduria;
    }

    int getCharisma() {
        return carisma;
    }

    int getHitpoints() {
        return hitpoints;
    }
}