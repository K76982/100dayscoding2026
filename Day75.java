import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        String user = input.nextLine();

        System.out.print("Password: ");
        String pass = input.nextLine();

        System.out.print("Program studi: ");
        String jurusan = input.nextLine();

        if (user.isEmpty())
            System.out.println("Username wajib diisi");

        if (pass.equals("Java123"))
            System.out.println("Password benar");

        if (jurusan.equalsIgnoreCase("informatika"))
            System.out.println("Program studi sesuai");

        if (jurusan.contains("Teknik"))
            System.out.println("Berada di Fakultas Teknik");

        if (!user.isEmpty() && pass.equals("Java123"))
            System.out.println("Login berhasil");
        else
            System.out.println("Login gagal");

        input.close();
    }
}
