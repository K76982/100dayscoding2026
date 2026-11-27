import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }

        for (int i = 0; i < angka.length / 2; i++) {
            int no = angka[i];
            angka[i] = angka[4 - i];
            angka[4 - i] = no;
        }

        System.out.println("\nangka yang dibalik:");

        for (int nilai : angka) {
            System.out.println(nilai);
        }

        sc.close();
    }
}
