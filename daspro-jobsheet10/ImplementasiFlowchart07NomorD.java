
import java.util.Scanner;

public class ImplementasiFlowchart07NomorD {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int survei[][] = new int[10][6];
        int sum = 0, pertanyaan = 10 * 6, rataAll;

        for (int i = 0; i < survei.length; i++) {
            System.out.println("--- Responden " + (i + 1) + " ---");
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("Masukkan nilai pertanyaan ke-" + (j + 1) + " : ");
                survei[i][j] = scan.nextInt();
                sum += survei[i][j];
            }
            System.out.println();
        }
        rataAll = sum / pertanyaan;
        System.out.println("Rata-rata keseluruhan : " + rataAll);
    }
}
