import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan judul buku: ");
        String judul = sc.nextLine();

        System.out.println("\n=== HASIL PENGOLAHAN BUKU ===");
        System.out.println("Jumlah karakter: " + judul.length());
        System.out.println("Huruf kapital: " + judul.toUpperCase());
        System.out.println("Huruf kecil: " + judul.toLowerCase());

        if(judul.length() > 20 ){
            System.out.println("judul buku cukup panjang");
        }else{
            System.out.println("judul buku tidak terlalu panjang");
        }

        sc.close();
    }

}
