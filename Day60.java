import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = input.nextInt();

        int angka = 1;
        int hasil = 0;

        while (angka <= n) {
            hasil = hasil + angka;
            angka++;
        }

        System.out.println("Jumlah angka: " + hasil);

        input.close();
    }
}
