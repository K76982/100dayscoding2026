import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;

        System.out.println("=== MENU LAYANAN KAMPUS ===");
        System.out.println("1. Informasi Jadwal");
        System.out.println("2. Informasi Nilai");
        System.out.println("3. Informasi Absensi");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");

        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Jadwal kuliah dapat dilihat di SIAKAD.");
                break;
            case 2:
                System.out.println("Nilai dapat dilihat di SIAKAD.");
                break;
            case 3:
                System.out.println("Silakan periksa absensi kuliah.");
                break;
            case 4:
                System.out.println("Terima kasih telah menggunakan program.");
                break;
            default:
                System.out.println("Menu tidak tersedia.");
        }

        input.close();
    }
}
