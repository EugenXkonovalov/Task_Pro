package de.telran.Pro_task;

public class Protection{
    private String name;
    private int level;

    public Protection(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Protection{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
