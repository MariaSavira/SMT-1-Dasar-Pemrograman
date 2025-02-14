
import java.util.Scanner;

public class bioskop7 {

    public static void main(String[] args) {
        int totalTerjual = 0, totalPenjualan = 0, pelangganInt;
        double hargaTiket = 50000;
        String pelanggan;
        Scanner sasa = new Scanner(System.in);

        do {
            System.out.print("Masukkan berapa tiket yang ingin dibeli pelanggan (ketik 'tutup' apabila selesai) : ");
            pelanggan = sasa.next();

            if (pelanggan.equalsIgnoreCase("tutup")) {
                System.out.println("Bioskop tutup. Terima kasih atas pembeliannya!");
                break;
            } else if (pelanggan.equalsIgnoreCase("0")) {
                System.out.println("Masukkan jumlah pelanggan yang valid!");
                continue;
            }

            pelangganInt = Integer.parseInt(pelanggan);

            hargaTiket = 50000;

            if (pelangganInt == 4) {
                hargaTiket = (hargaTiket - (hargaTiket * 0.10)) * pelangganInt;
            } else if (pelangganInt == 10) {
                hargaTiket = (hargaTiket - (hargaTiket * 0.15)) * pelangganInt;
            } else {
                hargaTiket = hargaTiket * pelangganInt;
            }

            System.out.println("Tiket yang akan dibeli : " + pelangganInt);
            System.out.println("Harga : Rp " + hargaTiket);

            totalTerjual += pelangganInt;
            totalPenjualan += hargaTiket;

        } while (true);
        System.out.println("\n======== TOTAL PENJUALAN TIKET DALAM SEHARI ========");
        System.out.println("Total Tiket Terjual        : " + totalTerjual);
        System.out.println("Total Rupiah Tiket Terjual : Rp " + totalPenjualan);
    }
}
