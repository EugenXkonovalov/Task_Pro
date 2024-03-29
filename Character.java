package de.telran.Pro_task;

public abstract class Character{
   private String name;
   private int health=100;
    public void introduce(){
        System.out.println("Halo my Name is "+name);
    }

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
    public abstract void countForce();
    public abstract void countProtection();

    public void fight(){
        countForce();
        countProtection();
    }
}

//Superhero battle
//
//abstract Character class:
//	- String name
//	- int health (изначально 100)
//	introduce()
//	abstract countForce()
//	abstract countProtection()
//	fight(Character another)
//
//EvilCreature class:
//	- int force
//	- int protection
//	static generateRandomEvilCreature()
//
//Superhero class:
//	- int force
//	- Weapon weapon
//	- Protection protection
//
//Weapon class:
//	- String name
//	- int force
//
//Protection class:
//	- String name
//	- int level
//1. Создать абстрактный класс Character с полями String name, int health (изначально 100)
//и методом introduce(). Все персонажи игры должны быть его наследниками.
//2. Создать классы EvilCreature, Superhero, Weapon, Protection.
//EvilCreature обладает силой и защитой, но не имеет доспехов и оружия.
//Superhero имеет собственную силу, доспехи и оружие.
//3. В методе main() класса SuperheroBattle создать несколько Superhero и EvilCreature,
//вывести в консоль их состояние.
//4. В класс Character добавить методы abstract countForce(),	abstract countProtection(),	fight().
//Метод fight() должен быть реализован с применением абстрактных методов countForce(), countProtectionLevel().
//При сражении побеждает персонаж, чья сила оказалась больше.
//У проигравшего персонажа отнимается здоровье пропорционально разнице сил и обратно пропорционально его защите
//fight()  ----> health =  health - (force1 - force2) / level
//5. В методе main() класса SuperheroBattle устроить сражение между несколькими персонажами.
//6. В классе EvilCreature реализовать метод generateRandomEvilCreature(). Устроить сражение между случайными персонажами.
