import java.util.Scanner;

public class gaji7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        short jamKerja;
        int bonus, pajak, upahPerJam, gajiBersih, gajiTotal;

        System.out.print("Berapa jam kerja karyawan? ");
        jamKerja = scan.nextShort();
        System.out.print("Berapa upah per-jamnya? ");
        upahPerJam = scan.nextInt();

        gajiBersih = jamKerja * upahPerJam;
        bonus = gajiBersih * 10 / 100;
        pajak = (gajiBersih + bonus) * 5 / 100;
        gajiTotal = gajiBersih + bonus - pajak;

        System.out.println("\n========================================================================");
        System.out.println("                            Perhitungan Gaji                           \n");
        System.out.println("Berdasarkan jam kerja dan upah kerja, maka gaji anda sebesar Rp " + gajiTotal + "\n");
        System.out.println("Dengan kriteria: ");
        System.out.println("Jam Kerja     : " + jamKerja + " jam");
        System.out.println("Upah Per Jam  : Rp " + upahPerJam);
        System.out.println("Gaji Bersih   : Rp " + gajiBersih);
        System.out.println("Bonus         : Rp " + bonus);
        System.out.println("Pajak         : Rp " + pajak + "\n");
        System.out.println("Sehingga, pendapatan total anda sebulannya sejumlah Rp " + gajiTotal);
        System.out.println("=========================================================================");
    }
}
