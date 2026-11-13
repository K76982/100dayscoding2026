import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menu;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Makan");
            System.out.println("2. Minum");
            System.out.println("3. Istirahat");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");

            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Anda memilih makan.");
                    break;
                case 2:
                    System.out.println("Anda memilih minum.");
                    break;
                case 3:
                    System.out.println("Anda memilih istirahat.");
                    break;
                case 4:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }

        } while (menu != 4);

        input.close();
    }
}
