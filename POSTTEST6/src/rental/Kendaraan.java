package rental;

public class Kendaraan {

    private String nomorPolisi;
    private String merk;
    private int tahunProduksi;
    private double hargaSewaDasar;

    public Kendaraan(String nomorPolisi, String merk,
        int tahunProduksi, double hargaSewaDasar) {
        this.nomorPolisi = nomorPolisi;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.hargaSewaDasar = hargaSewaDasar;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public double getHargaSewaDasar() {
        return hargaSewaDasar;
    }

    public void displayInfo() {
        System.out.println("Nomor Polisi : " + nomorPolisi);
        System.out.println("Merk          : " + merk);
        System.out.println("Tahun         : " + tahunProduksi);
        System.out.println("Harga Dasar   : " + hargaSewaDasar);
    }

    public double hitungHargaSewa(int hari) {

        double total = hargaSewaDasar * hari;

        if (tahunProduksi < 2015) {
            total *= 0.9; 
        }

        return total;
    }
}