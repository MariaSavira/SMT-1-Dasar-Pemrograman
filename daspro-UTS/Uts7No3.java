
import java.util.Scanner;

public class Uts7No3 {

    public static void main(String[] args) {
        int matematika, fisika, bahasaInggris, bahasaIndonesia, jurusan, jumlahMahasiswa;
        String namaJurusan, asalJurusan, lolos, hasil = "";
        Scanner input7 = new Scanner(System.in);

        System.out.print("Berapa jumlah mahasiswa yang mendaftar : ");
        jumlahMahasiswa = input7.nextInt();

        for (int i = 1; i <= jumlahMahasiswa; i++) {

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
            System.out.println("\nRata-rata Nilai : " + rataRata + "\n");

            if (jurusan == 1) {
                namaJurusan = "D4 - Teknik Informatika";
                if (asalJurusan.equalsIgnoreCase("IPA") || asalJurusan.equalsIgnoreCase("IPS")) {
                    if (matematika > 80 && rataRata >= 80) {
                        // System.out.println("Selamat, Anda lolos diterima di prodi " + namaJurusan + " dengan rata-rata " + rataRata);
                        lolos = "lolos";
                    } else {
                        // System.out.println("Maaf, Anda tidak lolos seleksi prodi " + namaJurusan + " karena nilai anda kurang");
                        lolos = "tidak lolos";
                    }
                } else {
                    // System.out.println("Maaf, Anda tidak lolos seleksi prodi " + namaJurusan + " karena anda bukan dari jurusan IPA atau IPS");
                    lolos = "tidak lolos";
                }
            } else if (jurusan == 2) {
                namaJurusan = "D4 - Sistem Informasi Bisnis";
                if (asalJurusan.equalsIgnoreCase("IPA")) {
                    if (matematika >= 70 && fisika >= 70) {
                        // System.out.println("Selamat, Anda lolos diterima di prodi " + namaJurusan + " dengan rata-rata " + rataRata);
                        lolos = "lolos";
                    } else {
                        // System.out.println("Maaf, Anda tidak lolos seleksi prodi " + namaJurusan + " karena nilai Anda kurang");
                        lolos = "tidak lolos";
                    }
                } else if (asalJurusan.equalsIgnoreCase("Bahasa")) {
                    if (rataRata > 80 && matematika > 70 && bahasaInggris > 70 && bahasaIndonesia > 70) {
                        // System.out.println("Selamat, Anda lolos diterima di prodi " + namaJurusan + " dengan rata-rata " + rataRata);
                        lolos = "lolos";
                    } else {
                        // System.out.println("Maaf, Anda tidak lolos seleksi prodi " + namaJurusan + "karena nilai Anda kurang");
                        lolos = "tidak lolos";
                    }
                } else {
                    // System.out.println("Maaf, Anda tidak lolos seleksi prodi " + namaJurusan + "karena Anda bukan dari jurusan IPA atau Bahasa");
                    lolos = "tidak lolos";
                }
            } else {
                namaJurusan = "Jurusan tidak valid";
                lolos = "tidak lolos";
            }
            hasil += "Mahasiswa " + i + ":\n";
            hasil += "  Asal Jurusan: " + asalJurusan + "\n";
            hasil += "  Jurusan Pilihan: " + namaJurusan + "\n";
            hasil += "  Rata-rata Nilai: " + rataRata + "\n";
            hasil += "  Status: " + lolos + "\n\n";
        }
        System.out.println("\n========== Hasil Seleksi ==========");
        System.out.println(hasil);

        input7.close();
    }
}
