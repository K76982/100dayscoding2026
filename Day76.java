import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kode mahasiswa: ");
        String kodeMahasiswa = input.nextLine();

        String dataBersih = kodeMahasiswa.trim();
        String dataBaru = dataBersih.replace("-", "/");
        String dataAkhir = dataBaru.substring(0, 9);

        System.out.println("\n=== SISTEM AKADEMIK ===");
        System.out.println("Kode mahasiswa: " + kodeMahasiswa);
        System.out.println("Setelah trim: " + dataBersih);
        System.out.println("Setelah replace: " + dataBaru);
        System.out.println("Hasil substring: " + dataAkhir);

        input.close();
    }
}
