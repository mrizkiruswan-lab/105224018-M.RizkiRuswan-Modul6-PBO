package game;

public class Hero {

    private String nama;
    private double health;
    private double attackPower;

    public Hero(String nama, double health, double attackPower) {
        this.nama = nama;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getNama() {
        return nama;
    }

    public double getHealth() {
        return health;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public void display() {
        System.out.println("Nama Hero   : " + nama);
        System.out.println("Health      : " + health);
        System.out.println("AttackPower : " + attackPower);
    }

    public void berlatih() {
        attackPower += 10;
        System.out.println(nama + " sedang berlatih!");
    }

    public void terimaSerangan(double damage) {
        health -= damage;
        System.out.println(nama + " menerima damage sebesar " + damage);
    }
}