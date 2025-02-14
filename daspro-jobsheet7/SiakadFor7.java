
import java.util.Scanner;

public class SiakadFor7 {

    public static void main(String[] args) {
        double nilai, tertinggi = 0, terendah = 100;
        byte lulus = 0, tidakLulus = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilai = sc.nextDouble();

            System.out.println("Nilai mahasiswa ke-" + i + " adalah " + nilai);
            if (nilai > tertinggi) {
                tertinggi = nilai;
            } else if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai > 60) {
                lulus++;
                System.out.println("Selamat, mahasiswa ke-" + i + " dinyatakan lulus!\n");

            } else if (nilai < 60) {
                tidakLulus++;
                System.out.println("Mohon maaf, mahasiswa ke-" + i + " dinyatakan tidak lulus.\n");

            }
        }
        System.out.println("__________________________________________\n");
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Banyaknya mahasiswa yang lulus : " + lulus);
        System.out.println("Banyaknya mahasiswa yang tidak lulus : " + tidakLulus);
        System.out.println("\n__________________________________________");
    }
}
