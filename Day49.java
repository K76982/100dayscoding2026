import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Uang jajan: ");
        int uang = input.nextInt();

        System.out.print("Harga makanan: ");
        int harga = input.nextInt();

        String hasil = (uang >= harga) ? "Uang cukup" : "Uang kurang";

        System.out.println(hasil);

        input.close();
    }
}
