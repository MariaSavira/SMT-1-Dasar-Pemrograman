import java.util.Scanner;

public class kafe7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Deklarasi Scanner 

        boolean keanggotaan; //Membuat variabel keanggotaan dengan tipe data boolean
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar; //Membuat beberapa variabel dengan tipe data double
        int jmlKopi, jmlTeh, jmlRoti; //Membuat beberapa variabel dengan tipe data integer
        float diskon = 10 / 100F; //membuat variabel baru bertipe data float dengan cara membagi 100 dengan 10

        System.out.print("Masukkan keanggotaan (true/false): "); //Petunjuk input
        keanggotaan = input.nextBoolean(); //Fungsi input untuk variabel keanggotaan
        System.out.print("Masukkan jumlah pembelian kopi: "); //Petunjuk input
        jmlKopi = input.nextInt(); //Fungsi input untuk variabel jmlKopi
        System.out.print("Masukkan jumlah pembelian teh: "); //Petunjuk input
        jmlTeh = input.nextInt(); //Fungsi input untuk variabel jmlTeh
        System.out.print("Masukkan jumlah pembelian roti: "); //Petunjuk input
        jmlRoti = input.nextInt(); //Fungsi input untuk variabel jmlRoti

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti); //menghitung total harga
        nominalBayar = totalHarga - (diskon * totalHarga); //Menotalkan harga akhir yang harus dibayarkan dengan memotong harga awal dengan diskon

        int  nominalInt = (int) nominalBayar, totalByte = (byte) totalHarga; //Membuat dua variabel casting dari double ke integer dan double ke byte

        System.out.println("Keanggotaan pelanggan " + keanggotaan); //Output untuk inputan keanggotaan
        System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti"); //Output untuk merangkum apa saja yang dibeli dan berapa jumlahnya
        System.out.println("Harga sementara: " + totalHarga); //Output untuk totalHarga
        System.out.println("Harga sementara dalam byte: " + totalByte); //Output untuk totalHarga dalam versi byte
        System.out.println("Apakah lanjut bayar? (true/false)"); //Input untuk menanyakan apakah user atau pelanggan ingin melanjutkan pembayaran atau tidak
        boolean lanjutBayar = input.nextBoolean(); //Fungsi input dengan menangkap boolean

        if (!lanjutBayar){ //apabila tidak lanjut membayar
            System.out.println("Proses pembayaran dihentikan. Terimakasih telah berbelanja :D"); //Maka proses akan dihentikan
            System.exit(0); //Proses di terminate
        }

        System.out.println("Nominal bayar Rp " + nominalBayar); //Mencetak atau memberikan output harga total terakhir setelah dikurangi diskon
        System.out.println("Nominal bayar secara integer Rp " + nominalInt); //Output nominalBayar tapi dengan integer
    }
}
