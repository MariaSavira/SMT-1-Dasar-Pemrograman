
import java.util.Scanner;

public class ImplementasiFlowchart07NomorB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int survei[][] = new int[10][6];
        int sum, rata2;

        for (int i = 0; i < survei.length; i++) {
            sum = 0;
            System.out.println("--- Responden " + (i+1) + " ---");
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("Masukkan nilai pertanyaan ke-" + (j+1) + " : ");
                survei[i][j] = scan.nextInt();
                sum += survei[i][j];
            }
            System.out.println();
            rata2 = sum / survei[i].length;
            System.out.println("\nRata-rata responden " + (i+1) + " : " + rata2);
            System.out.println();
        }
    }
}
