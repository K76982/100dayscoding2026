
import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== TEMPERATUR RUANGAN ===");
        System.out.print("Masukkan temperatur: ");
        double suhu = sc.nextDouble();

        if (suhu >= 35) {
            System.out.println("Ruangan sangat panas!");
        }

        if (suhu >= 25 && suhu < 35) {
            System.out.println("Ruangan cukup hangat.");
        }

        if (suhu < 25) {
            System.out.println("Ruangan terasa dingin.");
        }

        sc.close();
    }
}
