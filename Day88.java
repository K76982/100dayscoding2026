import java.util.Scanner;

public class Day88 {
    static void tampilkanNama(String nama) {
        System.out.println("Nama saya: " + nama);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();

        tampilkanNama(nama);

        sc.close();
    }
}
