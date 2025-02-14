import java.util.Scanner;
public class SearchNilai07Modifikasi {

    public static void main(String[] args) {
        int key;
        int hasil = 0, i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        i = sc.nextInt();
        int[] arrNilai = new int[i];


        for (i = 0; i < arrNilai.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari : ");
        key = sc.nextInt();

        for (i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            } 
        }
        System.out.println();
        if (hasil > 0){
            hasil = hasil + 1;
            System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
        } else if (hasil == 0){
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        System.out.println();
    }
}
