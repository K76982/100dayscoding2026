import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int angka = input.nextInt();

        if (angka > 0) {
            System.out.println("Bilangan positif");
        } else if (angka < 0) {
            System.out.println("Bilangan negatif");
        } else {
            System.out.println("Bilangan nol");
        }

        input.close();
    }
}
