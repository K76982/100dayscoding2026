import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = sc.nextInt();

        int angka = 1;
        int total = 1;

        while (angka <= n) {
            total *= angka;
            angka++;
        }

        System.out.println("Hasil: " + total);

        sc.close();
    }
}
