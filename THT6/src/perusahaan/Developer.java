package perusahaan;

//class turunan dari Karyawan
public class Developer extends Karyawan {
    private String level;        // Junior / Mid / Senior
    private int jumlahBugFix;    // jumlah bug yang diselesaikan

    //konstruktor (pakai super buat ambil dari parent)
    public Developer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok,double ratingKinerja, String level, int jumlahBugFix) {
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.level = level;
        this.jumlahBugFix = jumlahBugFix;
    }

    //override (ngubah cara hitung gaji)
    @Override
    public double hitungGajiTotal() {
        //ambil dulu dari parent
        double total = super.hitungGajiTotal();

        //tambahan berdasarkan level
        if (level.equalsIgnoreCase("Mid")) total += 1500000;
        else if (level.equalsIgnoreCase("Senior")) total += 3000000;
        //junior ga dapet tambahan

        //bonus bug (kalau rating >= 3)
        if (getRatingKinerja() >= 3.0) {
            total += jumlahBugFix * 50000;
        }
        return total;
    }

    //nambah info khusus developer
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Level: " + level);
        System.out.println("Jumlah Bug Fix: " + jumlahBugFix);
    }
}