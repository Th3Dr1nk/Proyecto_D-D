package net.SalesianosSchool.Mago;

// Importamos la clase base
import net.SalesianosSchool.Personaje.Personaje;

public class Mago extends Personaje {
    private int mana;

    public Mago(String name, int health, int damage, int mana) {
        super(name, health, damage);
        this.mana = mana;
    }

    @Override
    public void attack(Personaje target) {
        if (this.mana >= 10) {
            System.out.println(this.name + " lanza una bola de fuego a " + target.getName() + "!");
            target.takeDamage(this.damage * 2); 
            this.mana -= 10;
        } else {
            System.out.println(this.name + " ataca con su bastón a " + target.getName() + ".");
            target.takeDamage(this.damage);
        }
    }
}