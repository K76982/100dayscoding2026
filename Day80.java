import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }

        System.out.print("\nPilih indeks array (0-4): ");
        int indeks = sc.nextInt();

        System.out.println("Nilai pada indeks " + indeks + ": " + angka[indeks]);

        sc.close();
    }
}
