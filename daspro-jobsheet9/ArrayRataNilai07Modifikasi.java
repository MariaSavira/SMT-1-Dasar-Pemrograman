
import java.util.Scanner;

public class ArrayRataNilai07Modifikasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalLulus = 0, totalTdkLulus = 0, rata2, rataRata;
        int i, tdkLulus = 0, lulus = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        i = sc.nextInt();
        int nilaiMhs[] = new int[i];

        for (i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] < 70) {
                totalTdkLulus += nilaiMhs[i];
                tdkLulus++;
            } else if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                lulus++;
            }
        }

        rata2 = totalTdkLulus / tdkLulus;
        rataRata = totalLulus / lulus;
        System.out.println("Rata-rata lulus = " + rataRata);
        System.out.println("Rata-rata tidak lulus = " + rata2);
    }
}
