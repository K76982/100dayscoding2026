import java.util.Scanner;

public class Day65 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Masukkan jumlah baris: ");  
    int batas = input.nextInt();  

    for (int i = batas; i > 0; i--) {  
        System.out.println("*");  
    }  

    input.close();  
}

}
