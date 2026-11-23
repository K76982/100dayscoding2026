
import java.util.Scanner;

public class Day83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angka = new int[5];
        int total = 0;

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }

        for (int i = 0; i < angka.length; i++) {
            total = total + angka[i];
        }

        System.out.println("\nTotal: " + total);

        sc.close();
    }
}
