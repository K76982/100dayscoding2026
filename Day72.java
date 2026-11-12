import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;
        int jumlah = 0;

        do {
            System.out.print("Masukkan angka: ");
            angka = input.nextInt();

            if (angka >= 0) {
                jumlah = jumlah + angka;
            }

        } while (angka >= 0);

        System.out.println("Hasil penjumlahan: " + jumlah);

        input.close();
    }
}
