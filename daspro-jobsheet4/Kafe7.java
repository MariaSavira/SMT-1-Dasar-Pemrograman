import java.util.Scanner; // import scanner
public class Kafe7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // mendeklarasikan perintah Scanner sebagai scan
        String menu; // variabel menu bertipe data String
        char ukuranCup; // variabel ukuranCup bertipe data char
        int jumlah; // variabel jumlah dengan tipe data integer
        boolean keanggotaan; // variabel keanggotaan bertipe data boolean

        System.out.print("Masukkan menu : "); // inputan menu
        menu = scan.next(); // fungsi input menu
        System.out.print("Masukkan ukuran cup : "); // inputan ukuranCup
        ukuranCup = scan.next().charAt(0); // fungsi input ukuranCup
        System.out.print("Masukkan jumlah : "); // inputan jumlah
        jumlah = scan.nextInt(); // fungsi input jumlah
        System.out.print("Masukkan keanggotaan (true/false) : "); // inputan keanggotaan
        keanggotaan = scan.nextBoolean(); // fungsi input keanggotaan, diisi dengan true atau false

        double hargaMenu = 0; // variabel hargaMenu, tipe data double, value-nya 0

        switch(menu.toLowerCase()){ // switch dengan memperhatikan value variabel menu, tidak case sensitive
            case "kopi": // case pertama, apabila valuenya "kopi"
                hargaMenu = 12000; // harga kopi 12.000
                break; // akhir dari case pertama
            case "teh": // case kedua, apanila valuenya "teh"
                hargaMenu = 7000; // harganya menjadi 7.000
                break; // akhir dari case kedua
            case "coklat": // case ketiga, apabila valuenya "coklat"
                hargaMenu = 20000; // harganya 20.000
                break; // akhir dari case ketiga
        }

        double totalHarga = hargaMenu * jumlah; // variabel totalHarga, bertipe data double, valuenya diambil dari hargaMenu dikali dengan jumlah

        switch (ukuranCup){ // switch case dengan syarat melihat value ukuranCup
            case 'S': // apabila isinya 'S'
                break; // harga tetap, akhir dari case pertama
            case 'M': // apabila isinya 'M'
                totalHarga += 0.25 * totalHarga; // harga ditambah dengan totalHarga dikali 25%
                break; // akhir dari case kedua
            case 'L': // apabila isinya 'L'
                totalHarga += 0.4 * totalHarga; // harga ditambah dengan totalHarga dikali 40%
                break; // akhir dari case ketiga
            default: // apabila input atau value ukuranCup tidak sesuai
                System.out.println("Menu yang dipilih tidak tersedia."); // maka akan secara otomatis muncul pesan bahwa menu yang dipilih tidak tersedia
                return; // kembali

        }
        double diskon = keanggotaan ? 0.1 : 0; // apabila keanggotaan value-nya true, maka akan dapat diskon 10%, jika bukan member maka harga tetap
        double nominalBayar = totalHarga - (diskon * totalHarga); // nominalBayar merupakan totalHarga dikurangi dengan diskon member

        System.out.println("Item pembelian : " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup); // menampilkan ringkasan pemesanan
        System.out.println("Nominal bayar : " + nominalBayar); // menampilkan harga akhir yang harus dibayar
    }
}
