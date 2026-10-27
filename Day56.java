import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka N: ");
        int n = input.nextInt();

        int angka = 0;

        System.out.println("Mencetak angka 1 sampai N:");
        for (angka = 1; angka <= n; angka += 1) {
            System.out.print(angka + " ");
        }

        System.out.println("\nMencetak angka N sampai 1:");
        for (angka = n; angka > 0; angka -= 1) {
            System.out.print(angka + " ");
        }

        input.close();
    }
}
