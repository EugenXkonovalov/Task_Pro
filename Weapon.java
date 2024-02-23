package de.telran.Pro_task;

public class Weapon {
   private String name;
   private int force;

    public Weapon(String name, int force) {
        this.name = name;
        this.force = force;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", force=" + force +
                '}';
    }
}
