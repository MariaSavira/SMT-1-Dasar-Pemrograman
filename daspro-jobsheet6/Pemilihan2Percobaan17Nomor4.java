import java.util.Scanner; // import fungsi Scanner
public class Pemilihan2Percobaan17Nomor4{ // class bersifat public bernama Pemilihan2Percobaan17Nomor5
    public static void main(String[] args) {
        Scanner input7 = new Scanner(System.in); // deklarasi Scanner dengan nama scan
        int tahun; // variabel integer tahun, tidak ada isinya

        System.out.print("Masukkan tahun : "); // input tahun
        tahun = input7.nextInt(); // fungsi input tahun

        if((tahun % 4) == 0){ // apabila tahun modulus 4 sisa baginya sama dengan 0, maka
            if(tahun % 100 == 0){ // apabila modulus 100 sisa baginya sama dengan 0, maka 
                System.out.println("Ini tahun kabisat"); // muncul bahwa tahun tersebut adalah tahun kabisat
            }else if(tahun % 400 == 0){ // jika bukan, apabila modulus 400 sisa baginya sama dengan 0, maka 
                System.out.println("Ini tahun kabisat"); // outputnya "Ini tahun kabisat"
            }
        }else{ // selain itu
            System.out.println("Bukan tahun kabisat"); // maka muncul output "Bukan tahun kabisat"
        }
    }
}