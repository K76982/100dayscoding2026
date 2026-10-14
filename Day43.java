
import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== CEK KELIPATAN ANGKA ===");
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println("Kelipatan 3 dan 5");
        }

        if (angka % 3 == 0 && angka % 5 != 0) {
            System.out.println("Kelipatan 3");
        }

        if (angka % 5 == 0 && angka % 3 != 0) {
            System.out.println("Kelipatan 5");
        }

        if (angka % 3 != 0 && angka % 5 != 0) {
            System.out.println("Bukan kelipatan 3 atau 5");
        }

        input.close();
    }
}
