import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pin = -1;

        while (pin != 5421) {
            System.out.print("Masukkan PIN ATM: ");
            int masukan = sc.nextInt();

            pin = masukan;

            if (pin == 5421) {
                System.out.println("PIN benar, berhasil masuk!");
            } else {
                System.out.println("PIN salah!");
            }
        }

        sc.close();
    }
}
