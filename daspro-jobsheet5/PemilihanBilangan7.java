import java.util.Scanner; // import scanner

public class PemilihanBilangan7{
    public static void main(String[] args) { // fungsi main()
        Scanner scan = new Scanner(System.in); // Deklarasi scanner
        int angka; // initialisasi variabel angka dengan tipe data integer
        String hasil;

        System.out.print("Masukkan sebuah angka : "); // untuk menginput angka 
        angka = scan.nextInt(); // fungsi input angka

        // // menggunakan fungsi percabangan if else
        // if (angka % 2 == 0){  // persyaratan pertama if, modulus angka apabila dibagi dengan 2 sama dengan 0
        //     System.out.println("Angka " + angka + " termasuk bilangan genap"); // apabila benar, maka angka termasuk bilangan genap
        // } else { // apabila persyaratan if tidak terpenuhi, maka lainnya akan menghasilkan output seperti berikut
        //     System.out.println("Angka " + angka + " termasuk bilangan ganjil");  // apabila benar, maka angka termasuk bilangan ganjil
        // }

        hasil = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil"; // mengaplikasikan operator ternary dengan rumus yang sama
        System.out.println(hasil); // mencetak hasil
    }
}