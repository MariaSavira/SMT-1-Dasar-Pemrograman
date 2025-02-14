
import java.util.Scanner;

public class RataNilai7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j, i, nilaiMhs, totalNilai, rataNilai;
        i = 1; // inisialisasi outer loop, variabel i berisi 1
        while (i <= 5) { // outer loop atau loop level 1
            System.out.println("Input nilai mahasiswa ke-" + i);
            totalNilai = 0; // totalNilai dideklarasikan di sini supaya totalNilai direset pada setiap iterasinya
            for (j = 1; j <= 5; j++) { // inner loop atau loop level 2
                System.out.print("Nilai ke-" + j + " = "); // untuk penanda input nilai pada setiap looping dalam inner loop
                nilaiMhs = sc.nextInt(); // fungsi input nilaiMhs
                totalNilai += nilaiMhs; // penjumlahan setiap nilaiMhs kedalam variabel totalNilai
            }
            rataNilai = totalNilai / 5; // menghitung rata-rata nilai dengan membagi totalNilai dengan 5
            System.out.println("Rata-rata Nilai Mahasiswa ke-" + i + " adalah " + rataNilai);
            i++; // pada setiap iterasi pada outer loop, variabel i akan bertambah 1
        }
    }
}
