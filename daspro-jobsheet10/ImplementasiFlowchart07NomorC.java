import java.util.Scanner;
public class ImplementasiFlowchart07NomorC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int survei[][] = new int[10][6];
        int sum[] = new int[6], rata2[] = new int[6];

        for (int i = 0; i < survei.length; i++) {
            System.out.println("--- Responden " + (i+1) + " ---");
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("Masukkan nilai pertanyaan ke-" + (j+1) + " : ");
                survei[i][j] = scan.nextInt();
                sum[j] += survei[i][j];
            }
            System.out.println();
        }
        for (int k = 0; k < sum.length; k++) {
            rata2[k] = sum[k] / survei.length;
        }
        for (int j = 0; j < rata2.length; j++) {
            System.out.println("Rata-rata pertanyaan " + (j+1) + " : " + rata2[j]);
        }
    }
}
