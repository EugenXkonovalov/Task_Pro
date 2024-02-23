package de.telran.Pro_task;

public class Superhero extends Character {
    int force;
    Protection protection;
    Weapon weapon;

    public Superhero(String name, int force, Protection protection, Weapon weapon) {
        super(name);
        this.force = force;
        this.protection = protection;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "force=" + force +
                ", protection=" + protection +
                ", weapon=" + weapon +
                getName()+getHealth() +
                '}';
    }
}
