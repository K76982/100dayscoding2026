import java.util.Scanner;

public class Day85 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int[] data = new int[5];  
    int i = 0;  
    int minimal;  

    while (i < data.length) {  
        System.out.print("Input angka ke-" + (i + 1) + ": ");  
        data[i] = sc.nextInt();  
        i++;  
    }  

    minimal = data[0];  
    i = 1;  

    while (i < data.length) {  
        if (data[i] < minimal) {  
            minimal = data[i];  
        }  
        i++;  
    }  

    System.out.println("\nNilai minimal: " + minimal);  

    sc.close();  
}

}
