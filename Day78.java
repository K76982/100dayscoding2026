import java.util.Scanner;

public class Day78 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String akun, sandi, masuk, kunci;  

    System.out.println("=== LOGIN AKUN ===");  
    System.out.print("Buat akun: ");  
    akun = sc.nextLine();  
    System.out.print("Buat sandi: ");  
    sandi = sc.nextLine();  

    System.out.println("\n=== MASUK AKUN ===");  

    masuk = "";  
    kunci = "";  

    while (!masuk.equals(akun) || !kunci.equals(sandi)) {  
        System.out.print("Masukkan akun: ");  
        masuk = sc.nextLine();  

        System.out.print("Masukkan sandi: ");  
        kunci = sc.nextLine();  

        if (!masuk.equals(akun) || !kunci.equals(sandi)) {  
            System.out.println("Data salah, ulangi login!\n");  
        }  
    }  

    System.out.println("Selamat, login berhasil!");  
    sc.close();  
}

}
