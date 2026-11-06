import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah simbol: ");
        int n = input.nextInt();

        for (int i = n; i > 0; i--) {
            System.out.print("*");
        }

        input.close();
    }
}
