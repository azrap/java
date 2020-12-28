package EnhancedPlayer;

public class EnhancedPlayer {

    private String name;
    // devault value
    private int hitPoints = 100;
    private String weapon;

//can name internal and external fields differently with encapsulation. Helps prevent unauthorized access;
    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health >0 && health<=100){
            this.hitPoints =health;

        }
        this.weapon = weapon;
    }

    public  void loseHealth() {

        if (hitPoints >0 && hitPoints <=100){
            this.hitPoints = hitPoints;

        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return hitPoints;
    }

    public String getWeapon() {
        return weapon;
    }

}
