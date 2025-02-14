import java.util.Scanner; // import Scanner
public class Pemilihan2Percobaan17{ // nama class bersifat public
    public static void main(String[] args) { 
        Scanner input7 = new Scanner(System.in); // deklarasi Scanner dengan nama scan 
        int tahun; // variabel tahun bertipe data integer
 
        System.out.print("Masukkan tahun : "); // input tahun
        tahun = input7.nextInt(); // fungsi input tahun

        if((tahun % 4) == 0){ // apabila tahun dibagi empat dan hasil sisa baginya sama dengan 0, maka
            if((tahun % 100) == 0){ // dan apabila tahun hasil modulusnya dengan 100 sama dengan 0, maka
                System.out.println("Bukan tahun kabisat"); // outputnya berupa bukan tahun kabisat
            }
        }else{
            System.out.println("Bukan tahun kabisat"); // selain itu, maka outputnya bukan tahun kabisat
        }
    }
}