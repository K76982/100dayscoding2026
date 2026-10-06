import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu: ");
        int suhu = input.nextInt();

        if (suhu >= 30) {
            System.out.println("Suhu panas");

            if (suhu >= 35) {
                System.out.println("Sangat panas");
            }
        } else {
            System.out.println("Suhu tidak panas");
        }
    }
}
