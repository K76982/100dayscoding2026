import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] bilangan = new int[5];

        for (int i = 0; i < bilangan.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            bilangan[i] = sc.nextInt();
        }

        System.out.print("Masukkan angka yang dicari: ");
        int cari = sc.nextInt();

        boolean ditemukan = false;
        int indeks = 0;

        for (int angka : bilangan) {
            if (angka == cari) {
                ditemukan = true;
                System.out.println("Angka ditemukan pada indeks: " + indeks);
                break;
            }
            indeks++;
        }

        if (!ditemukan) {
            System.out.println("Angka tidak ditemukan!");
        }

        sc.close();
    }
}
