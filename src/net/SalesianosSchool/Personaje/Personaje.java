package net.SalesianosSchool.Personaje;

public abstract class Personaje {
    protected String name;
    protected int health;
    protected int damage;

    public Personaje(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public abstract void attack(Personaje target);

    public void takeDamage(int amount) {
        this.health -= amount;
        if (this.health < 0) this.health = 0;
        System.out.println(this.name + " takes " + amount + " damage! Remaining health: " + this.health);
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public String getName() {
        return name;
    }
}