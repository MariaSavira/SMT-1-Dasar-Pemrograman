import java.util.Scanner;
public class TugasJobsheet6 {
    public static void main(String[] args) {
        String merk, kategori;
        byte ukuran;
        double harga = 0;
        Scanner input7 = new Scanner(System.in);

        System.out.println("_____________________________________");
        System.out.println("\n=========== Daftar Sepatu ===========");
        System.out.println("_____________________________________");
        System.out.println("\n1. Converse   - Slip On (Uk : 36 - 40)");
        System.out.println("               High Top (Uk : 40 - 44)");
        System.out.println("2. Sketcher   -   Woman (Uk : 36 - 41)");
        System.out.println("                    Man (Uk : 41 - 44)");
        System.out.println("3. Nike          - Kids (Uk : 36 - 40)");
        System.out.println("                  Adult (Uk : 40 - 44)");
        System.out.println("_____________________________________");

        System.out.print("\nMasukkan Merk Sepatu yang Ingin Anda Beli : ");
        merk = input7.nextLine();
        System.out.print("Masukkan Kategori : ");
        kategori = input7.nextLine();
        System.out.print("Masukkan Ukuran : ");
        ukuran = input7.nextByte();

        if (merk.equalsIgnoreCase("converse")) {
            if (kategori.equalsIgnoreCase("Slip on")){
                if (ukuran >= 36 && ukuran <= 40){
                    harga = 800000;
                    System.out.println("Harga dari Sepatu merk " + merk + " kategori " + kategori + " ukuran " + ukuran + " adalah Rp"+ harga);
                } else {
                    System.out.println("Masukkan Ukuran dengan Benar!");
                    return;
                } 
            } else if (kategori.equalsIgnoreCase("high top")){
                if (ukuran >= 40 && ukuran <= 44){
                    harga = 1200000;
                    System.out.println("Harga dari Sepatu merk " + merk + " kategori " + kategori + " ukuran " + ukuran + " adalah Rp"+ harga);
                } else {
                    System.out.println("Masukkan Ukuran dengan Benar!");
                    return;
                }
            }
        } else if (merk.equalsIgnoreCase("sketcher")){
            if (kategori.equalsIgnoreCase("woman")){
                if (ukuran >= 36 && ukuran <= 41){
                    harga = 1000000;
                    System.out.println("Harga dari Sepatu merk " + merk + " kategori " + kategori + " ukuran " + ukuran + " adalah Rp"+ harga);
                } else {
                    System.out.println("Masukkan Ukuran dengan Benar!");
                    return;
                }
            } else if (kategori.equalsIgnoreCase("man")){
                if (ukuran >= 41 && ukuran <= 44){
                    harga = 1800000;
                    System.out.println("Harga dari Sepatu merk " + merk + " kategori " + kategori + " ukuran " + ukuran + " adalah Rp"+ harga);
                } else {
                    System.out.println("Masukkan Ukuran dengan Benar!");
                    return;
                }
            }
        } else if (merk.equalsIgnoreCase("nike")){
            if (kategori.equalsIgnoreCase("kids")){
                if (ukuran >= 41 && ukuran <= 44){
                    harga = 750000;
                    System.out.println("Harga dari Sepatu merk " + merk + " kategori " + kategori + " ukuran " + ukuran + " adalah Rp"+ harga);
                } else {
                    System.out.println("Masukkan Ukuran dengan Benar!");
                    return;
                }
            } else if (kategori.equalsIgnoreCase("adult")){
                if (ukuran >= 41 && ukuran <= 44){
                    harga = 1500000;
                    System.out.println("Harga dari Sepatu merk " + merk + " kategori " + kategori + " ukuran " + ukuran + " adalah Rp"+ harga);
                } else {
                    System.out.println("Masukkan Ukuran dengan Benar!");
                    return;
                }
            }
        } else {
            System.out.println("Masukkan Merk sepatu dengan benar!");
        } 
    }
}
