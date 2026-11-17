public class Day77 {
public static void main(String[] args) {

String nama = "Muhammad Aydil  ";    
  
    System.out.println("=== PENGOLAHAN STRING ===");    
  
    System.out.println("Panjang teks       : " + nama.length());    
  
    nama = nama.trim();    
    System.out.println("Setelah trim       : " + nama);    
  
    System.out.println("Huruf kapital      : " + nama.toUpperCase());    
    System.out.println("Huruf kecil        : " + nama.toLowerCase());    
  
    System.out.println("Karakter pertama   : " + nama.charAt(0));    
    System.out.println("Setelah replace    : " + nama.replace("Muhammad", ""));    
    System.out.println("Contains           : " + nama.contains("Aydil"));    
    System.out.println("Equals             : " + nama.equals("Muhammad Aydil"));    
    System.out.println("Substring          : " + nama.substring(0, 8));    
}

}
