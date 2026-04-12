import java.util.ArrayList;
import perusahaan.*;

//class buat ngejalanin program
public class Main {
    public static void main(String[] args) {
        //arrayList biar bisa nampung semua tipe (polymorphism)
        ArrayList<Karyawan> daftar = new ArrayList<>();

        //data sesuai soal
        daftar.add(new Karyawan("K01", "Ruswan", 2020, 5000000, 2.0)); // kena penalti
        daftar.add(new Developer("D01", "Paulus", 2018, 6000000, 4.0, "Senior", 20)); // gede banget
        daftar.add(new Developer("D02", "Zakia", 2024, 5500000, 2.8, "Mid", 15)); // bonus hangus
        daftar.add(new Manajer("M01", "Intan", 2015, 8000000, 4.8, "IT", 10)); // dapet bonus ekstra
        daftar.add(new Manajer("M02", "Haikal", 2025, 7500000, 3.5, "HR", 3)); // normal

        double totalAnggaran = 0;
        double ratingTotal = 0;
        double maxGaji = 0;
        String namaTertinggi = "";

        //loop semua data
        for (Karyawan k : daftar) {
            k.displayInfo();

            double gaji = k.hitungGajiTotal();
            System.out.println("Total Gaji Bulan Ini: Rp " + gaji);
            System.out.println("----------------------------------");

            //nambah total gaji perusahaan
            totalAnggaran += gaji;

            //nambah total rating
            ratingTotal += k.getRatingKinerja();

            //cari gaji paling tinggi
            if (gaji > maxGaji) {
                maxGaji = gaji;
                namaTertinggi = k.getNama();
            }
        }

        //output akhir
        System.out.println("Total Anggaran Gaji Perusahaan: Rp " + totalAnggaran);
        System.out.println("Highest Earner: " + namaTertinggi);
        System.out.println("Rata-rata Rating: " + (ratingTotal / daftar.size()));
    }
}
