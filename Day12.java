import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nama;
        String nim;
        String jurusan;
        String alamat;
        int umur;

        System.out.println("BIODATA");

        System.out.print("Masukkan Nama    : ");
        nama = input.nextLine();

        System.out.print("Masukkan NIM     : ");
        nim = input.nextLine();

        System.out.print("Masukkan Jurusan : ");
        jurusan = input.nextLine();

        System.out.print("Masukkan Umur    : ");
        umur = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan Alamat  : ");
        alamat = input.nextLine();

        System.out.println("BIODATA SAYA");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Umur    : " + umur + " tahun");
        System.out.println("Alamat  : " + alamat);

        input.close();
    }
}
