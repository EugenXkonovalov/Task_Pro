package de.telran.Pro_task;

public class EvilCreature extends Character {
    private int force;
    private int protection;

    public EvilCreature(String name, int force, int protection) {
        super(name);
        this.force = force;
        this.protection = protection;
    }

    @Override
    public String toString() {
        return "EvilCreature{" +
                "force=" + force +
                ", protection=" +
                protection + getName() +
                getHealth() +
                '}';
    }
}
