import java.util.Scanner; // memanggil atau mengimport scanner

public class PemilihanHariDenganIf7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // mendeklarasikan scanner
        String dayType; // variabel untuk tipe hari bertipe data string
        byte dayName; // variabel untuk nama hari bertipe daya byte

        System.out.print("Input day name : "); // menandakan inputan nama hari
        dayName = scan.nextByte(); // fungsi input nama hari

        switch (dayName) { // percabangan switch case menggunakan nama hari
            case 1: // nama hari valuenya harus salah satu dari case berikut
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "weekday"; // apabila nama hari case 1-5 otomatis terdeteksi sebagai weekday
                break; // akhir dari case weekday
            case 6: // nama hari dari beberapa case weekend
            case 7:
                dayType = "weekend"; // apabila case 6 atau case 7 terpenuhi, maka akan terdeteksi weekend
                break; // akhir dari case weekday
            default: // default value apabila input tidak terdaftar dalam case
                dayType = "invalid number"; // maka akan terdeteksi sebagai invalid number
        }

        System.out.println(dayName + " is a " + dayType); // mencetak hasil
    }
}
