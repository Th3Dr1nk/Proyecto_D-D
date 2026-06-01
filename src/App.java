import net.SalesianosSchool.Guerrero.Guerrero;
import net.SalesianosSchool.Mago.Mago;
import net.SalesianosSchool.Personaje.Personaje;

public class App {
    public static void main(String[] args) {
        Guerrero garen = new Guerrero("Garen", 100, 20, 5);
        Mago veigar = new Mago("Veigar", 70, 15, 30);

        System.out.println("--- ¡COMIENZA EL DUELO! ---");

        while (garen.isAlive() && veigar.isAlive()) {
            garen.attack(veigar);
            if (veigar.isAlive()) {
                veigar.attack(garen);
            }
            System.out.println("---------------------------");
        }

        if (garen.isAlive()) {
            System.out.println("¡" + garen.getName() + " es el vencedor!");
        } else {
            System.out.println("¡" + veigar.getName() + " ha ganado el duelo!");
        }
    }
}