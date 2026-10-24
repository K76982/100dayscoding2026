import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tabungan;
        int total = 0;
        int pilihan = 1;

        do {
            System.out.print("Masukkan uang tabungan: Rp");
            tabungan = input.nextInt();

            total += tabungan;

            System.out.print("Menabung lagi? (1 = Ya, 0 = Tidak): ");
            pilihan = input.nextInt();

        } while (pilihan == 1);

        System.out.println("Total tabungan Dwi: Rp" + total);

        input.close();
    }
}
