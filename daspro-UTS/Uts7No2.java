import java.util.Scanner;

public class Uts7No2 {
    public static void main(String[] args) {
        int matematika, fisika, bahasaInggris, bahasaIndonesia, jurusan;
        String namaJurusan, asalJurusan;
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
        System.out.print("Masukkan asal jurusan Anda : ");
        asalJurusan = input7.next();

        System.out.println("\n====== Pilih Jurusan Anda ======");
        System.out.println("1. D4 - Teknik Informatika");
        System.out.println("2. D4 - Sistem Informasi Bisnis");
        System.out.print("Masukkan pilihan Anda (dalam nomor) : ");
        jurusan = input7.nextInt();

        int rataRata = (matematika + fisika + bahasaInggris + bahasaIndonesia) / 4;
        
        System.out.println("\n========= Rata-rata Nilai =========");
        System.out.println("Matematika       : " + matematika);
        System.out.println("Fisika           : " + fisika);
        System.out.println("Bahasa Inggris   : " + bahasaInggris);
        System.out.println("Bahasa Indonesia : " + bahasaIndonesia);
        System.out.println("\nRata-rata Nilai : " + rataRata);

        if (jurusan == 1){
            namaJurusan = "D4 - Teknik Informatika";
            if (asalJurusan.equalsIgnoreCase("IPA") || asalJurusan.equalsIgnoreCase("IPS")){
                if (matematika > 80 && rataRata >= 80){
                    System.out.println("Selamat, Anda lolos diterima di prodi " + namaJurusan + " dengan rata-rata " + rataRata);
                } else {
                    System.out.println("Maaf, Anda tidak lolos seleksi prodi " + namaJurusan + " karena nilai anda kurang");    
                }
            } else {
                System.out.println("Maaf, Anda tidak lolos seleksi prodi " + namaJurusan + " karena anda bukan dari jurusan IPA atau IPS");
            }
        } else if (jurusan == 2){
            namaJurusan = "D4 - Sistem Informasi Bisnis";
            if (asalJurusan.equalsIgnoreCase("IPA")){
                if (matematika >= 70 && fisika >= 70){
                    System.out.println("Selamat, Anda lolos diterima di prodi " + namaJurusan + " dengan rata-rata " + rataRata);
                } else {
                    System.out.println("Maaf, Anda tidak lolos seleksi prodi " + namaJurusan + " karena nilai Anda kurang");    
                }
            } else if (asalJurusan.equalsIgnoreCase("Bahasa")){
                if (rataRata > 80 && matematika > 70 && bahasaInggris > 70 && bahasaIndonesia > 70){
                    System.out.println("Selamat, Anda lolos diterima di prodi " + namaJurusan + " dengan rata-rata " + rataRata);
                } else {
                    System.out.println("Maaf, Anda tidak lolos seleksi prodi " + namaJurusan + "karena nilai Anda kurang");    
                }
            } else {
                System.out.println("Maaf, Anda tidak lolos seleksi prodi " + namaJurusan + "karena Anda bukan dari jurusan IPA atau Bahasa");    
            }
        }
    }
}
