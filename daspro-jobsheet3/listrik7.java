import java.util.Scanner;

public class listrik7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        short watt, jam;
        int kWh, maxkWh = 500, tagihanListrik;

        System.out.print("Masukkan daya listrik (watt): ");
        watt = scan.nextShort();
        System.out.print("Masukkan berapa jam penggunaan listrik: ");
        jam = scan.nextShort();

        kWh = watt * jam;
        tagihanListrik = kWh * 1500;

        System.out.println("===========================================================");
        System.out.println("\nJadi, tagihan listrik Anda bulan ini sebesar Rp " + tagihanListrik);
        System.out.println("Anda telah menggunakan sebesar " + kWh + " kWh.\n");
        System.out.println("===========================================================");

        if (kWh > maxkWh){
            System.out.println("Penggunaan listrik anda lebih dari 500 kWh.");
        }
        else if (kWh == maxkWh) {
            System.out.println("Penggunaan listrik anda sama dengan 500 kWh.");
        }
        else{
            System.out.println("Penggunaan listrik anda kurang dari 500 kWh.");
        }
    }
}
