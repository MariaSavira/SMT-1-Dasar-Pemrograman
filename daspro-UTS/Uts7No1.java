import java.util.Scanner;

public class Uts7No1 {
    public static void main(String[] args) {
        int matematika, fisika, bahasaInggris, bahasaIndonesia;
        Scanner input7 = new Scanner(System.in);

        System.out.println("========= Seleksi Perguruan Tinggi =========");
        System.out.print("Masukkan nilai Matematika Anda : ");
        matematika = input7.nextInt();
        System.out.print("Masukkan nilai Fisika Anda : ");
        fisika = input7.nextInt();
        System.out.print("Masukkan nilai Bahasa Inggris Anda : ");
        bahasaInggris = input7.nextInt();
        System.out.print("Masukkan nilai Bahasa Indonesia Anda : ");
        bahasaIndonesia = input7.nextInt();

        int rataRata = (matematika + fisika + bahasaInggris + bahasaIndonesia) / 4;
        
        System.out.println("\n========= Rata-rata Nilai =========");
        System.out.println("Matematika       : " + matematika);
        System.out.println("Fisika           : " + fisika);
        System.out.println("Bahasa Inggris   : " + bahasaInggris);
        System.out.println("Bahasa Indonesia : " + bahasaIndonesia);
        System.out.println("\nRata-rata Nilai : " + rataRata);
    }
}
