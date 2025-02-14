
import java.util.Scanner;

public class KafeDoWhile7 {

    public static void main(String[] args) {
        int kopi, teh, roti, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga;
        String namaPelanggan;
        Scanner input7 = new Scanner(System.in);

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar) : ");
            namaPelanggan = input7.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Jumlah kopi : ");
            kopi = input7.nextInt();
            System.out.print("Jumlah teh : ");
            teh = input7.nextInt();
            System.out.print("Jumlah roti : ");
            roti = input7.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaTeh);
            System.out.println("Total yang harus dibayar : Rp " + totalHarga);
            input7.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
    }
}
