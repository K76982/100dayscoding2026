import java.util.Scanner;

public class Day69 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi: ");
        int tinggi = input.nextInt();

        System.out.print("Masukkan lebar: ");
        int lebar = input.nextInt();

        for (int i = tinggi; i >= 1; i--) {
            for (int j = lebar; j >= 1; j--) {
                System.out.print("+");
            }
            System.out.println();
        }

        input.close();
    }
}
