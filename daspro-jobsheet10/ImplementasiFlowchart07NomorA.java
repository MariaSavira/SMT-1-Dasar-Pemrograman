
import java.util.Scanner;

public class ImplementasiFlowchart07NomorA {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int survei[][] = new int[10][6];

        for (int i = 0; i < survei.length; i++) {
            System.out.println("--- Responden " + (i + 1) + " ---");
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("Masukkan nilai pertanyaan ke-" + (j + 1) + " : ");
                survei[i][j] = scan.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < survei.length; i++) {
            System.out.println("--- Jawaban Responden " + (i+1) + " ---");
            for (int j = 0; j < survei[i].length; j++) {
                System.out.println("Pertanyaan " + (j+1) + " : " + survei[i][j]);
            }
        }

    }
}
