import java.util.Scanner;

public class Day74 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan kalimat: ");  
    String kalimat = sc.nextLine();  

    System.out.println("\n=== HASIL STRING ===");  
    System.out.println("Teks asli: " + kalimat);  
    System.out.println("Jumlah karakter: " + kalimat.length());  
    System.out.println("Huruf kapital: " + kalimat.toUpperCase());  
    System.out.println("Huruf kecil: " + kalimat.toLowerCase());  

    sc.close();  
}

}
