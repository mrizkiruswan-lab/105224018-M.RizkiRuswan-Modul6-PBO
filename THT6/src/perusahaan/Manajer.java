package perusahaan;

//class turunan buat manajer
public class Manajer extends Karyawan {
    private String divisi;
    private int jumlahAnggotaTim;

    public Manajer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok,double ratingKinerja, String divisi, int jumlahAnggotaTim) {
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.divisi = divisi;
        this.jumlahAnggotaTim = jumlahAnggotaTim;
    }

    @Override
    public double hitungGajiTotal() {
        //ambil dari parent dulu
        double total = super.hitungGajiTotal();

        //tunjangan manajer (300k per orang)
        total += jumlahAnggotaTim * 300000;

        //bonus ekstra kalau rating tinggi (>4.5)
        if (getRatingKinerja() > 4.5) {
            total += total * 0.15;
        }
        return total;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Divisi: " + divisi);
        System.out.println("Jumlah Anggota Tim: " + jumlahAnggotaTim);
    }
}
