import game.Hero;
import game.HeroStrength;

public class Main {

    public static void main(String[] args) {

        // membuat objek hero biasa
        Hero hero1 = new Hero("Ruswan", 100, 20);

        // membuat objek hero strength
        HeroStrength hero2 = new HeroStrength("Xavier azek", 150, 25);

        System.out.println("=== STATUS AWAL ===");
        hero1.display();
        System.out.println();
        hero2.display();

        // latihan
        System.out.println("\n=== HERO BERLATIH ===");
        hero1.berlatih();
        hero2.berlatih();

        // terkena serangan
        System.out.println("\n=== TERKENA DAMAGE 50 ===");
        hero1.terimaSerangan(50);
        hero2.terimaSerangan(50);

        // status akhir
        System.out.println("\n=== STATUS AKHIR ===");
        hero1.display();
        System.out.println();
        hero2.display();
    }
}