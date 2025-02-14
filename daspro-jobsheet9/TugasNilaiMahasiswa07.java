
import java.util.Scanner;

public class TugasNilaiMahasiswa07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, rataRata;

        System.out.print("Masukkan jumlah mahasiswa : ");
        int mhs = sc.nextInt();
        System.out.print("Masukkan total nilai mahasiswa : ");
        int i = sc.nextInt();
        int nilaiMahasiswa[] = new int[i];
        int indexTerbesar = Integer.MIN_VALUE, indexTerkecil = Integer.MAX_VALUE;

        for (int l = 1; l <= mhs; l++) {
            System.out.println("\nMahasiswa ke-" + l);
            System.out.println("-------------------");
            for (i = 0; i < nilaiMahasiswa.length; i++) {
                System.out.print("Masukkan nilai ke-" + (i + 1) + " : ");
                nilaiMahasiswa[i] = sc.nextInt();
                sum += nilaiMahasiswa[i];

                if (indexTerbesar < nilaiMahasiswa[i]) {
                    indexTerbesar = nilaiMahasiswa[i];
                }
                if (indexTerkecil > nilaiMahasiswa[i]) {
                    indexTerkecil = nilaiMahasiswa[i];
                }
            }
            rataRata = sum / nilaiMahasiswa.length;

            System.out.println();
            System.out.println("Total nilai     : " + sum);
            System.out.println("Rata-rata       : " + rataRata);
            System.out.println("Nilai tertinggi : " + indexTerbesar);
            System.out.println("Nilai terendah  : " + indexTerkecil + "\n");

            System.out.println("Daftar nilai : ");
            for (i = 0; i < nilaiMahasiswa.length; i++) {
                System.out.println("Nilai ke-" + (i + 1) + " : " + nilaiMahasiswa[i]);
            }

            sum = 0;
        }

    }
}
