
import java.util.Scanner;

public class Pemilihan2Percobaan27 {

    public static void main(String[] args) {
        String menu;
        boolean member, qris;
        byte jumlah_beli = 0;
        double total_bayar, diskon, harga = 0;

        Scanner input7 = new Scanner(System.in);

        System.out.println("_________________________");
        System.out.println("\n===== MENU KAFE JTI =====");
        System.out.println("_________________________");
        System.out.println("\n1. Kopi");
        System.out.println("2. Teh");
        System.out.println("3. Roti");
        System.out.println("_________________________");

        System.out.print("\nPilih Menu : ");
        menu = input7.next();
        System.err.print("Masukkan Jumlah : ");
        jumlah_beli = input7.nextByte();
        System.out.print("Apakah punya member? ( true / false ) : ");
        member = input7.nextBoolean();
        System.out.print("Apakah Anda ingin membayar dengan Qris? ( true / false ) : ");
        qris = input7.nextBoolean();

        if (member) {
            if (!qris) {
                diskon = 0.10;
                System.out.println("Anda mendapatkan diskon 10%");

                if (menu.equalsIgnoreCase("Kopi")) {
                    harga = 20000;
                } else if (menu.equalsIgnoreCase("teh")) {
                    harga = 7000;
                } else if (menu.equalsIgnoreCase("roti")) {
                    harga = 20000;
                } else {
                    System.out.println("Masukkan pilihan menu dengan benar");
                    return;
                }
                total_bayar = (harga - (harga * diskon)) * jumlah_beli;
                System.out.println("Total bayar setelah diskon Rp " + total_bayar);
            } else if (qris) {
                diskon = 1000;
                System.out.println("Anda mendapatkan diskon Rp " + diskon + " !");

                if (menu.equalsIgnoreCase("Kopi")) {
                    harga = 20000;
                } else if (menu.equalsIgnoreCase("teh")) {
                    harga = 7000;
                } else if (menu.equalsIgnoreCase("roti")) {
                    harga = 20000;
                } else {
                    System.out.println("Masukkan pilihan menu dengan benar");
                    return;
                }
                total_bayar = (harga - diskon) * jumlah_beli;
                System.out.println("Total bayar setelah diskon Rp " + total_bayar);
            }
        } else if (!member) {
            if (!qris) {
                if (menu.equalsIgnoreCase("Kopi")) {
                    harga = 20000;
                } else if (menu.equalsIgnoreCase("teh")) {
                    harga = 7000;
                } else if (menu.equalsIgnoreCase("roti")) {
                    harga = 20000;
                } else {
                    System.err.println("Masukkan pilihan menu dengan benar");
                    return;
                }
                total_bayar = harga * jumlah_beli;
                System.out.println("Total bayar tanpa diskon Rp " + total_bayar);
            } else if (qris) {
                diskon = 1000;
                System.out.println("Anda mendapatkan diskon Rp " + diskon + " !");

                if (menu.equalsIgnoreCase("Kopi")) {
                    harga = 20000;
                } else if (menu.equalsIgnoreCase("teh")) {
                    harga = 7000;
                } else if (menu.equalsIgnoreCase("roti")) {
                    harga = 20000;
                } else {
                    System.err.println("Masukkan pilihan menu dengan benar");
                    return;
                }
                total_bayar = (harga - diskon) * jumlah_beli;
                System.out.println("Total bayar tanpa diskon Rp " + total_bayar);
            }
        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("_________________________");
    }
}
