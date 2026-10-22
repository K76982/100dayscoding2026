import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas angka: ");
        int batas = input.nextInt();

        for (int i = 1; i <= batas; i += 2) {
            System.out.println(i);
        }

        input.close();
    }
}
