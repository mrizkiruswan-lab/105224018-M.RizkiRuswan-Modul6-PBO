package game;
//nomor 3
public class HeroStrength extends Hero {

    private String tipe = "Strength";

    public HeroStrength(String nama, double health, double attackPower) {
        super(nama, health, attackPower);
    }

    //nomor 4
    @Override
    public void display() {
        super.display();
        System.out.println("Tipe Hero   : " + tipe);
    }

    @Override
    public void terimaSerangan(double damage) {
        double damageMasuk = damage * 0.5;
        health -= damageMasuk;

        System.out.println(nama +
                " menerima damage (reduced) sebesar " + damageMasuk);
    }
}