import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;

        System.out.println("=== JENIS KENDARAAN ===");
        System.out.println("1. Motor");
        System.out.println("2. Mobil");
        System.out.println("3. Bus");
        System.out.println("4. Sepeda");
        System.out.print("Pilih kendaraan: ");

        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Kendaraan yang dipilih adalah Motor");
                break;
            case 2:
                System.out.println("Kendaraan yang dipilih adalah Mobil");
                break;
            case 3:
                System.out.println("Kendaraan yang dipilih adalah Bus");
                break;
            case 4:
                System.out.println("Kendaraan yang dipilih adalah Sepeda");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }

        input.close();
    }
}
