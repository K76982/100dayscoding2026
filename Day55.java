import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai;

        while (true) {
            System.out.print("Input nilai (-1 untuk keluar): ");
            nilai = sc.nextInt();

            if (nilai == -1) {
                System.out.println("Pemeriksaan nilai selesai!");
                break;
            } else if (nilai == 40) {
                System.out.println("Program dihentikan karena nilai 40 ditemukan!");
                sc.close();
                return;
            } else if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid!");
                continue;
            } else {
                System.out.println("Nilai mahasiswa: " + nilai);
            }
        }

        sc.close();
    }
}
