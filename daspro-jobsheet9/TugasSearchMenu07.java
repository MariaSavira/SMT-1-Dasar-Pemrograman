import java.util.Scanner;

public class TugasSearchMenu07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String menu[] = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Capuccino", "Chocolate Ice"};
        String namaMenu;
        int hasil = -1; 

        System.out.println("- Pemesanan Makanan -");
        for (String a : menu) {
            if (a.equals("Chocolate Ice")) {
                System.out.print(a);
            } else {
                System.out.print(a + ", ");
            }
        }

        System.out.println("\n\nSilahkan pilih makanan kesukaan anda!");
        System.out.print("Nama Menu : ");
        namaMenu = scan.nextLine();

        
        for (int i = 0; i < menu.length; i++) {
            if (namaMenu.equalsIgnoreCase(menu[i])) {
                hasil = i; 
                break; 
            }
        }

        
        if (hasil != -1) {
            System.out.println("\nMenu tersedia!");
            System.out.println("Terdapat " + menu[hasil] + " pada indeks ke-" + hasil);
        } else {
            System.out.println("Mohon maaf, menu tidak tersedia");
        }
    }
}
