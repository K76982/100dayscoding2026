import java.util.Scanner;

public class Day70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();

        for (int a = 0; a < baris; a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
