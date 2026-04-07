package game;

public class HeroStrength extends Hero {

    private String tipe = "Strength";

    public HeroStrength(String nama, double health, double attackPower) {
        super(nama, health, attackPower);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tipe Hero   : " + tipe);
    }

    @Override
    public void terimaSerangan(double damage) {
        double reducedDamage = damage * 0.5;
        super.terimaSerangan(reducedDamage);
    }
}