package net.SalesianosSchool.Guerrero;

import net.SalesianosSchool.Personaje.Personaje;

public class Guerrero extends Personaje {
    private int extraArmor;

    public Guerrero(String name, int health, int damage, int extraArmor) {
        super(name, health, damage);
        this.extraArmor = extraArmor;
    }

    @Override
    public void attack(Personaje target) {
        System.out.println(this.name + " swings a mighty sword at " + target.getName() + "!");
        target.takeDamage(this.damage);
    }

    @Override
    public void takeDamage(int amount) {
        int reducedDamage = amount - this.extraArmor;
        if (reducedDamage < 0) reducedDamage = 0;
        super.takeDamage(reducedDamage);
    }
}