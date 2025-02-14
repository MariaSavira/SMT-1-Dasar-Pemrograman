
import java.util.Scanner;
public class SIAKAD07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa : ");
        int siswa = scan.nextInt();
        System.out.println("Masukkan jumlah matkul : ");
        int matkul = scan.nextInt();

        int nilai[][] = new int[siswa][matkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input data mahasiswa ke-" + (i + 1));
            double totalPersiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + " : ");
                nilai[i][j] = scan.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPersiswa / 3);
        }

        System.out.println("===================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

        for (int i = 0; i < 4; i++) {
            double totalPermatkul = 0;

            for (int j = 0; j < 3; j++) {
                totalPermatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (i + 1) + " : " + totalPermatkul / 4);
        }

    }
}
