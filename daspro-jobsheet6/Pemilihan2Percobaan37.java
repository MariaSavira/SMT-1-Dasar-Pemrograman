import java.util.Scanner;
public class Pemilihan2Percobaan37 {
    public static void main(String[] args) {
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        Scanner input7 = new Scanner(System.in);

        System.out.print("Masukkan Kategori : ");
        kategori = input7.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan : ");
        penghasilan = input7.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")){
            if (penghasilan <= 2000000){
                pajak = 0.10;
            } else if (penghasilan <= 3000000){
                pajak = 0.15;
            } else {
                pajak = 0.20;
            }
            gajiBersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.print("Penghasil Bersih : " + gajiBersih);
        } else if (kategori.equalsIgnoreCase("pebisnis")){
            if (penghasilan <= 2500000){
                pajak = 0.15;
            } else if (penghasilan <= 3500000){
                pajak = 0.20;
            } else {
                pajak = 0.25;
            }
            gajiBersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.print("Penghasilan Bersih : " + gajiBersih);
        } else {
            System.out.println("Kategori Salah !");
        } 
    }
}
