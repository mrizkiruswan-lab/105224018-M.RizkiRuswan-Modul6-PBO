package perusahaan;

//class utama (parent) buat semua karyawan
public class Karyawan {
    //semua atribut dibuat private (biar aman / encapsulation)
    private String idKaryawan;
    private String nama;
    private int tahunMasuk;
    private double gajiPokok;
    private double ratingKinerja;

    //konstruktor buat isi data awal
    public Karyawan(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;

        //validasi rating (harus 1 - 5)
        //kalau salah, langsung jadi 3.0 (default)
        if (ratingKinerja < 1.0 || ratingKinerja > 5.0) {
            this.ratingKinerja = 3.0;
        } else {
            this.ratingKinerja = ratingKinerja;
        }
    }

    //getter buat ambil data
    public String getIdKaryawan() { return idKaryawan; }
    public String getNama() { return nama; }
    public int getTahunMasuk() { return tahunMasuk; }
    public double getGajiPokok() { return gajiPokok; }
    public double getRatingKinerja() { return ratingKinerja; }

    //setter rating (biar tetap valid)
    public void setRatingKinerja(double rating) {
        if (rating >= 1.0 && rating <= 5.0) {
            this.ratingKinerja = rating;
        }
    }

    //function buat hitung total gaji
    public double hitungGajiTotal() {
        int tahunSekarang = 2026;

        //hitung masa kerja
        int masaKerja = tahunSekarang - tahunMasuk;

        //bonus loyalitas = 5% tiap tahun
        double bonusLoyalitas = gajiPokok * 0.05 * masaKerja;

        //total awal
        double total = gajiPokok + bonusLoyalitas;

        //kalau rating jelek (<2.5) kena potong 10%
        if (ratingKinerja < 2.5) {
            total -= total * 0.10;
        }
        return total;
    }

    //nampilin info dasar
    public void displayInfo() {
        System.out.println("ID: " + idKaryawan);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Rating: " + ratingKinerja);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
    }
}
