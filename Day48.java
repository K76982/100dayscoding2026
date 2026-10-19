import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        System.out.println("\n=== KALKULATOR ===");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Pilih operasi (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Hasil: " + (angka1 + angka2));
                break;
            case 2:
                System.out.println("Hasil: " + (angka1 - angka2));
                break;
            case 3:
                System.out.println("Hasil: " + (angka1 * angka2));
                break;
            case 4:
                if (angka2 != 0) {
                    System.out.println("Hasil: " + (angka1 / angka2));
                } else {
                    System.out.println("Tidak bisa dibagi nol!");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}
