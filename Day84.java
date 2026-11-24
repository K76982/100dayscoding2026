import java.util.Scanner;

public class Day84 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int[] data = new int[5];  
    int i = 0;  
    int maksimal;  

    while (i < data.length) {  
        System.out.print("Input angka ke-" + (i + 1) + ": ");  
        data[i] = sc.nextInt();  
        i++;  
    }  

    maksimal = data[0];  
    i = 1;  

    while (i < data.length) {  
        if (data[i] > maksimal) {  
            maksimal = data[i];  
        }  
        i++;  
    }  

    System.out.println("\nAngka terbesar: " + maksimal);  

    sc.close();  
}

}
