package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;
    private String sound;

    public Monster(String name, int hitPoints, int strength, String weapon, String sound) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = weapon;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getSound() {
        return sound;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon=" + weapon +
                ", sound=" + sound +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" +  this.hitPoints);
        values.add(2, "" +  this.strength);
        values.add(3, "" +  this.weapon);
        values.add(4, "" +  this.sound);

        return values;

    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() >0){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get((3));
            this.sound = savedValues.get((4));
        }

    }
}
