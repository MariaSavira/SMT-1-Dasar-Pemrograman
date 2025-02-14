import java.util.Scanner; // import scanner

public class Siakad7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Mendefinisikan Scanner dengan nama sc

        String nama, nim, kelas, nilaiAkhirHuruf, kualifikasi; //Mendeklarasikan bahwa ada 5 variabel bertipe data String, yakini nama, nim, kelas, predikat nilai, dan kualifikasi
        byte absen; //Mendeklarasikan bahwa ada sebuah variabel bernama absen dengan tipe data byte
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir; //Ada 4 variabel bertipe data double, yakini nilaiKuis, nilaiTugas, nilaiUjian, dan nilaiAkhir

        System.out.print("Masukan nama: "); //Isian nama
        nama = sc.nextLine(); //Fungsi untuk mengisi value dari variabel nama
        System.out.print("Masukan NIM: "); //Menandakan isian NIM
        nim = sc.nextLine(); //Fungsi untuk mengisi value dari variabel nim
        System.out.print("Masukan kelas: "); //Menandakan isian kelas
        kelas = sc.nextLine(); //Fungsi untuk mengisi value dari variabel kelas
        System.out.print("Masukan nomor absen: "); //Isian absen
        absen = sc.nextByte(); //Fungsi untuk mengisi value dari variabel absen, bertipe data byte
        System.out.print("Masukan nilai kuis: "); //Isian kuis
        nilaiKuis = sc.nextDouble(); //Fungsi untuk mengisi value dari variabel nilaiKuis bertipe data double
        System.out.print("Masukan nilai tugas: "); //Isian nilai tugas
        nilaiTugas = sc.nextDouble(); //Fungsi untuk mengisi value dari variabel nilaiTugas bertipe data double
        System.out.print("Masukan nilai ujian UTS: "); //Isian nilai ujian
        nilaiUTS = sc.nextDouble(); //Fungsi untuk mengisi value dari variabel nilaiUjian bertipe data double
        System.out.print("Masukan nilai ujian UAS: "); //Isian nilai ujian
        nilaiUAS = sc.nextDouble(); //Fungsi untuk mengisi value dari variabel nilaiUjian bertipe data double

        nilaiAkhir = (nilaiKuis * 20 / 100) + (nilaiTugas * 15 / 100) + (nilaiUTS * 30 / 100) + (nilaiUAS * 35 / 100); //Menghitung nilai akhir

        if (nilaiAkhir > 80 && nilaiAkhir <= 100){ // pemilihan menggunakan if else dengan syarat nilai, apabila nilaiAkhir lebih dari 80 namun kurang dari sama dengan 100
            nilaiAkhirHuruf = "A"; // maka akan mendapat predikat A
            kualifikasi = "Sangat Baik"; // dengan kualifikasi sangat baik
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80){ // jika bukan, apabila nilai akhir lebih besar dari 73 dan lebih kecil sama dengan 80
            nilaiAkhirHuruf = "B+"; // maka akan mendapat predikat B+
            kualifikasi = "Lebih dari Baik"; // dengan kualifikasi lebih dari baik
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73){ // jika bukan, apabila nilai akhir lebih besar dari 65 dan lebih kecil sama dengan 73
            nilaiAkhirHuruf = "B"; // maka akan mendapat predikat B
            kualifikasi = "Baik"; // dengan kualifikasi baik
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65){ // jika bukan, apabila nilai akhir lebih besar dari 60 dan lebih kecil sama dengan 65
            nilaiAkhirHuruf = "C+"; // maka akan mendapat predikat C+
            kualifikasi = "Lebih dari Cukup"; // dengan kualifikasi lebih dari cukup
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60){ // jika bukan, apabila nilai akhir lebih besar dari 50 dan lebih kecil sama dengan 60
            nilaiAkhirHuruf = "C"; // maka akan mendapat predikat C
            kualifikasi = "Cukup"; // dengan kualifikasi cukup
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50){ // jika bukan, apabila nilai akhir lebih besar dari 39 dan lebih kecil sama dengan 50
            nilaiAkhirHuruf = "D"; // maka akan mendapat predikat D
            kualifikasi = "Kurang"; // dengan kualifikasi kurang
        } else { // jika bukan salah satu dari atas, maka
            nilaiAkhirHuruf = "E"; // predikat E
            kualifikasi = "Gagal"; // dinyatakan gagal
        }

        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") " + "kelas " + kelas + " nomor absen " + absen); //Menampilkan output data diri dari value yang didapatkan dari fungsi scanner
        System.out.println("Nilai Akhir : " + nilaiAkhir); //Output dari nilai akhir
        System.out.println("Nilai Akhir Huruf : " + nilaiAkhirHuruf); //Output dari predikat nilai
        System.out.println("Kualifikasi : " + kualifikasi); //Output dari kualifikasi
    }
}