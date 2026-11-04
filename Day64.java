import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = sc.nextInt();

        int angka = n;
        int total = 1;

        while (angka >= 1) {
            total *= angka;
            angka--;
        }

        System.out.println("Hasil faktorial: " + total);

        sc.close();
    }
}
