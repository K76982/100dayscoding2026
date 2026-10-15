
import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PREDIKAT NILAI ===");
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        if (nilai >= 90 && nilai <= 100) {
            System.out.println("Predikat A");
        }

        if (nilai >= 80 && nilai < 90) {
            System.out.println("Predikat B");
        }

        if (nilai >= 70 && nilai < 80) {
            System.out.println("Predikat C");
        }

        if (nilai >= 60 && nilai < 70) {
            System.out.println("Predikat D");
        }

        if (nilai >= 0 && nilai < 60) {
            System.out.println("Predikat E");
        }

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid!");
        }

        input.close();
    }
}
