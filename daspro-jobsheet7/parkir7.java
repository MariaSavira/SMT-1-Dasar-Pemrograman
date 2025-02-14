
import java.util.Scanner;

public class parkir7 {

    public static void main(String[] args) {
        int jenis, durasi, total = 0, totalPendapatan = 0;
        Scanner jj = new Scanner(System.in);

        do {
            System.out.print("Masukkan jenis kendaraan (1 mobil, 2 motor, 0 keluar) : ");
            jenis = jj.nextInt();

            if (jenis == 0) {
                System.out.println("Keluar dari sistem. Terima kasih!");
                break;
            }

            if (jenis != 1 && jenis != 2) {
                System.out.println("Masukkan input yang benar !!");
                continue;
            }

            System.out.print("Lama durasi (dalam jam): ");
            durasi = jj.nextInt();

            if (durasi <= 0) {
                System.out.println("Masukkan durasi yang valid !!");
                continue;
            }

            total = 0;

            if (durasi > 5) {
                total = 12500;
            } else if (jenis == 1) {
                total = durasi * 3000;
            } else if (jenis == 2) {
                total = durasi * 2000;
            }

            System.out.println("Tarif parkir : Rp " + total);

            totalPendapatan += total;

        } while (true);

        System.out.println("\n\n======== TOTAL PENJUALAN TIKET DALAM SEHARI ========");
        System.out.println("Total pendapatan = Rp " + totalPendapatan);
    }
}
