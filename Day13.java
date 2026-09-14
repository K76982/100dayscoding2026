import java.util.Scanner;

public class Day13 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Soal 1");
        System.out.println("Nama\t Jurusan");
        System.out.println("sela\t informatika");
        System.out.println("meli\t informatika");

        System.out.println("\nSoal 2");
        int jumlahstok = 20;
        int HargaBarang = 25500;
        double BeratBarang =3.5;
        System.out.println("Jumlah stok: " + jumlahstok);
        System.out.println("Harga Barang: " + HargaBarang);
        System.out.println("Berat Barang: " + BeratBarang + " kg");

        System.out.println("\nSoal 3");
        String nama1 = "Dwi";
        String Nim = "D0224028";
        int umur = 19;
        double ipk = 3.89;
        var jeniskelamin ="p";
        System.out.println("=====INFORMASI MAHASISWA====");
        System.out.printf("Nama\t: "+nama1);
        System.out.printf("\nNim\t: "+Nim);
        System.out.printf("\nUmur\t: "+umur);
        System.out.printf("\nIPK\t: "+ipk);
        System.out.printf("\nJeniskelamin\t: "+jeniskelamin);

        System.out.println("\n\nSoal 5");
        System.out.print("Masukkan nama pesanan: ");
        String nama = input.nextLine();
        System.out.print("Masukkan nama makanan: ");
        String makan = input.nextLine();
        System.out.print("Masukkan jumlah: ");
        char jumlah = input.next().charAt(0);
        System.out.print("Masukkan kode: ");
        String kode = input.next();

        System.out.println("Nama pemesan: "+nama);
        System.out.println("makanan: "+makan);
        System.out.println("jumlah: "+jumlah);
        System.out.println("kode: "+kode);
    }
}
