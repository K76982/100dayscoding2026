import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = sc.nextInt();

        if (nilai % 2 != 0) {
            System.out.println("Nilai " + nilai + " adalah ganjil");
        } else {
            System.out.println("Nilai " + nilai + " adalah genap");
        }
    }
}
