import java.util.Scanner;

public class Day62 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa(M):");
        int m = input.nextInt();

        System.out.print("Masukkan jumlah laporan per mahasiswa(N):");
        int n = input.nextInt();

        System.out.println("n/--- DAFTAR TUGAS MAHASISWA ---");

        int mhs = 1;

        while (mhs <= m) {
            System.out.println("Mahasiswa ke- " + mhs);

            int tugas = 1;
            while (tugas <= n) {
                System.out.println("- Laporan  " + tugas);
                tugas++;
            }
            mhs++;
            System.out.println();
        }
        input.close();
    }
}
