import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angka = new int[5];

        System.out.println("=== INPUT ARRAY ===");

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }

        System.out.println("\n=== ISI ARRAY ===");

        for (int i = 0; i < angka.length; i++) {
            System.out.println("Indeks " + i + ": " + angka[i]);
        }

        sc.close();
    }
}
