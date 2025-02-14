import java.util.Scanner;

public class Siakad7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Mendefinisikan Scanner dengan nama sc

        String nama, nim, kelas; //Mendeklarasikan bahwa ada 3 variabel bertipe data String, yakini nama, nim, kelas
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

        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") " + "kelas " + kelas + " nomor absen " + absen); //Menampilkan output data diri dari value yang didapatkan dari fungsi scanner
        System.out.println("Nilai Akhir: " + nilaiAkhir); //Output dari nilai akhir
    }
}