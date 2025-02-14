import java.util.Scanner;

public class CaborDanAtlet7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String politeknik;

        System.out.println("Selamat datang di Porseni 2024!");
        System.out.println("\nBerikut adalah daftar cabor yang dilombakan : ");
        System.out.println("1. Badminton");
        System.out.println("2. Tenis Meja");
        System.out.println("3. Basket");
        System.out.println("4. Bola Voly");

        System.out.print("\n\n Masukkan Instansi Anda (Politeknik) : ");
        politeknik = scan.next();

        int atlet, cabor;
        String namaAtlet = "", tampilData = "";
        for (cabor = 1; cabor <= 4; cabor++){
            if (cabor == 1) {
                tampilData += ("\n---------- PENDAFTAR BADMINTON ----------");
                System.out.println("------------- BADMINTON -------------");
                System.out.println("Masukkan Atlet untuk Cabor Badminton");
            } else if (cabor == 2) {
                tampilData += ("\n---------- PENDAFTAR TENIS MEJA ----------");
                System.out.println("------------- TENIS MEJA -------------");
                System.out.println("Masukkan Atlet untuk Cabor Tenis Meja");
            } else if (cabor == 3) {
                tampilData += ("\n---------- PENDAFTAR BASKET ----------");
                System.out.println("------------- BASKET -------------");
                System.out.println("Masukkan Atlet untuk Cabor Basket");
            } else if (cabor == 4) {
                tampilData += ("\n---------- PENDAFTAR BOLA VOLY ----------");
                System.out.println("------------- BOLA VOLY -------------");
                System.out.println("Masukkan Atlet untuk Cabor Bola Voly");
            } for (atlet = 1; atlet <= 5; atlet++ ) {
                System.out.print("Atlet " + atlet + " : ");
                namaAtlet = scan.next();
                tampilData += ("\nAtlet " + atlet + " : " + namaAtlet);
            }
        }

        System.out.println("\nData Pendaftar Porseni 2024 oleh Instansi " + politeknik);
        System.out.println(tampilData);

    }
}
