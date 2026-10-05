import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu: ");
        int suhu = input.nextInt();

        if (suhu >= 40) {
            System.out.println("Sangat panas");
        } else if (suhu >= 35) {
            System.out.println("Panas");
        } else if (suhu >= 20) {
            System.out.println("Sejuk");
        } else {
            System.out.println("Dingin");
        }
    }
}
