import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        String hasil = bilangan % 2 == 0 ? "Genap" : "Ganjil";

        System.out.println("Bilangan tersebut adalah " + hasil);

        input.close();
    }
}
