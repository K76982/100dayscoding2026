import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MENU KAMPUS ===");
        System.out.println("1. Cek Jadwal Kuliah");
        System.out.println("2. Cek Nilai");
        System.out.println("3. Cek Absensi");
        System.out.print("Pilih menu: ");

        int pilihan = sc.nextInt();

        if (pilihan == 1) {
            System.out.println("Jadwal kuliah: Senin - Jumat");
        } else if (pilihan == 2) {
            System.out.println("Nilai Anda sedang diproses");
        } else if (pilihan == 3) {
            System.out.println("Absensi Anda berhasil diperiksa");
        } else {
            System.out.println("Pilihan tidak valid");
        }

        sc.close();
    }
}
