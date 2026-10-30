import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai M: ");
        int m = input.nextInt();

        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();

        System.out.println("Bilangan kelipatan " + m + ":");

        for (int i = m; i <= n; i += m) {
            System.out.print(i + " ");
        }

        input.close();
    }
}
