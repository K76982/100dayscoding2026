import java.util.Scanner;

public class Day11{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan nama : ");
		String nama = sc.nextLine();
		
		
		System.out.print("Masukkan alamat : " );
		String alamat = sc.nextLine();
		
		System.out.print("Masukkan umur : ");
		int umur = sc.nextInt();
		
		
		System.out.println("Nama : " + nama);
		System.out.println("Alamat : " + alamat);
		System.out.println("Umur : " + umur + " tahun ");
	}
}
