import java.util.Scanner;

public class Day67 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Masukkan N: ");  
    int n = input.nextInt();  

    for (int i = n; i > 0; i--) {  
        for (int j = n; j > 0; j--) {  
            System.out.print("*");  
        }  
        System.out.println();  
    }  

    input.close();  
}

}
