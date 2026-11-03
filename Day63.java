import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan M: ");
        int m = sc.nextInt();

        System.out.print("Masukkan N: ");
        int n = sc.nextInt();

        int pangkat = 0;
        int total = 1;

        while (pangkat < n) {
            total *= m;
            pangkat++;
        }

        System.out.println("Hasil pangkat: " + total);

        sc.close();
    }
}
