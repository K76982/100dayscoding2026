import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Angka pertama: ");
        int angkaPertama = sc.nextInt();
        System.out.println("Angka kedua: ");
        int angkaKedua = sc.nextInt();

        System.out.println("Pilih operasi (1=+, 2=-, 3=*, 4=/)");
        int pilihan = sc.nextInt();

        if(pilihan == 1){
            System.out.println("Hasil : " + (angkaPertama + angkaKedua));
        } else if (pilihan == 2) {
            System.out.println("Hasil : " + (angkaPertama - angkaKedua));
        }else if (pilihan == 3) {
            System.out.println("Hasil : " + (angkaPertama * angkaKedua));
        }else if (pilihan == 4) {
            System.out.println("Hasil : " + (angkaPertama / angkaKedua));
        }else{
            System.out.println("Hasil tidak ditemukan");
        }
        sc.close();
    }
}
