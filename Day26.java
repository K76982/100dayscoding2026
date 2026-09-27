import java.util.Scanner;
public class Day26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jarijari :" );
        double jarijari= sc.nextDouble();


        double luas = Math.PI * jarijari * jarijari;
        System.out.print("masukkan luaslingkaran : " + luas);

        sc.close();
    }
}
