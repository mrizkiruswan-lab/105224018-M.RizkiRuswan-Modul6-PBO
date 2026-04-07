package game;
//nomor 1
public class Hero {

    protected String nama;
    protected double health;
    protected double attackPower;

    public Hero(String nama, double health, double attackPower) {
        this.nama = nama;
        this.health = health;
        this.attackPower = attackPower;
    }

    //nomor 2
    public void display() {
        System.out.println("Nama Hero   : " + nama);
        System.out.println("Health      : " + health);
        System.out.println("AttackPower : " + attackPower);
    }

    public void berlatih() {
        attackPower += 10;
        System.out.println(nama + " sedang berlatih dia ges");
    }

    public void terimaSerangan(double damage) {
        health -= damage;
        System.out.println(nama + " menerima damage sebesar " + damage);
    }
}