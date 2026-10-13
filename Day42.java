import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENGHITUNG GAJI BERSIH ===");

        System.out.print("Masukkan gaji pokok: Rp ");
        double gajiPokok = input.nextDouble();

        System.out.print("Masukkan potongan gaji: Rp ");
        double potongan = input.nextDouble();

        double gajiBersih = gajiPokok - potongan;

        if (gajiBersih >= 0) {
            System.out.println("Gaji bersih: Rp " + gajiBersih);
        }

        if (gajiBersih < 0) {
            System.out.println("Gaji bersih tidak valid!");
        }

        input.close();
    }
}
