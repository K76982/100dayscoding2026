import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan batas angka: ");
        int n = sc.nextInt();

        System.out.println("Bilangan ganjil:");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nBilangan genap:");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
