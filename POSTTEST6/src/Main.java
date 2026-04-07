import rental.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Kendaraan> daftar = new ArrayList<>();

        daftar.add(new Mobil("KT234AA", "Toyota Innova", 2012, 300000, 7));

        daftar.add(new Mobil("DA678BB", "Honda Brio", 2020, 250000, 5));

        daftar.add(new Motor("B999CC", "Yamaha R25", 2019, 150000, 250));

        daftar.add(new Motor("D8888DD", "Honda Beat", 2021, 100000, 110));

        for (Kendaraan k : daftar) {

            System.out.println("================================");
            k.displayInfo();

            System.out.println(
                "Total Biaya Sewa selama 5 Hari: "
                + k.hitungHargaSewa(5)
            );
        }
    }
}