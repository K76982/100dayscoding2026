import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilai = new int[5];
        int total = 0;
        int posisi = 0;

        System.out.println("=== INPUT NILAI ===");

        while (posisi != 5) {
            System.out.print("Nilai ke-" + (posisi + 1) + ": ");
            nilai[posisi] = sc.nextInt();
            posisi++;
        }

        posisi = 0;

        while (posisi != 5) {
            total = total + nilai[posisi];
            posisi++;
        }

        double rataRata = total / 5.0;

        System.out.println("\n=== HASIL ===");

        posisi = 0;
        while (posisi != 5) {
            System.out.println("Nilai ke-" + (posisi + 1) + ": " + nilai[posisi]);
            posisi++;
        }

        System.out.println("Jumlah keseluruhan: " + total);
        System.out.println("Nilai rata-rata: " + rataRata);

        sc.close();
    }
}
