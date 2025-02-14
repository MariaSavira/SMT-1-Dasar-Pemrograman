
import java.util.Scanner;

public class BioskopWithScanner07Modifikasi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int baris, kolom, next;
        String nama;
        String penonton[][] = new String[4][2];

        for (String nonton[] : penonton){
            for (int i = 0; i < nonton.length; i++){
                nonton[i] = "***";
            } 
        }

        while (true) {
            System.out.print("\nMasukkan nama : ");
            nama = scan.next();
            System.out.print("Masukkan baris : ");
            baris = scan.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom = scan.nextInt();
            scan.nextLine();

            if (!penonton[baris-1][kolom-1].equals("***")){
                System.out.println("Mohon maaf, kursi sudah terisi.");
                continue;
            }

            penonton[baris - 1][kolom - 1] = nama;

            System.out.println("\nPilih aksi selanjutnya : ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Daftar penonton");
            System.out.println("3. Keluar");
            System.out.print("\nAksi (angka) : ");
            next = scan.nextInt();

            if (next == 1) {
                continue;
            } else if (next == 2) {
                System.out.println("\n -- Daftar Penonton --\n");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.println("Penonton baris " + (i + 1) + " : " + String.join(", ", penonton[i]));
                }
            } else if (next == 3) {
                break;
            }
        }
    }
}
