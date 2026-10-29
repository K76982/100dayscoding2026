import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka N: ");
        int n = input.nextInt();

        System.out.println("Angka ganjil N-1:");

        int ganjil = (n % 2 == 0) ? n - 1 : n;

        for (int i = ganjil; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nAngka genap N-1:");

        int genap = (n % 2 == 0) ? n : n - 1;

        for (int i = genap; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }

        input.close();
    }
}
