
import java.util.Scanner;

public class TugasPesanan07 {

    public static void main(String[] args) {
        Scanner sasa = new Scanner(System.in);
        int jumlahPesanan, sum = 0;

        System.out.println(" Aplikasi Admin Kafe PolinemA");
        System.out.println("---         Kasir          ---");

        System.out.print("\nMasukkan jumlah pesanan : ");
        jumlahPesanan = sasa.nextInt();
        String menu[] = new String[jumlahPesanan];
        int harga[] = new int[jumlahPesanan];

        for (int i = 0; i < menu.length; i++) {

            System.out.print("\nMasukkan menu  : ");
            menu[i] = sasa.next();
            System.out.print("Masukkan harga : ");
            harga[i] = sasa.nextInt();

            sum += harga[i];
        }

        System.out.println("\n---   Rincian Pesanan  ---");
        for (int i = 0; i < menu.length; i++){
            System.out.println("- " + menu[i] + " : Rp " + harga[i]);
        }
        System.out.println("Total Harga : Rp " + sum);
    }
}
