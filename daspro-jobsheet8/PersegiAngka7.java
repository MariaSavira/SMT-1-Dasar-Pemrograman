import java.util.Scanner;

public class PersegiAngka7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, baris, kolom;

        System.out.print("Masukkan nilai N : ");
        N = scan.nextInt();

        if (N < 3){
            System.out.println("Masukkan nilai yang valid ! ");
        } else {
            for (baris = 1; baris <= N; baris++) {
                for (kolom = 1; kolom <= N; kolom++) {
                    if (baris == 1 || baris == N || kolom == 1 || kolom == N) {
                        System.out.print(N + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
