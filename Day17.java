public class Day17 {
    public static void main(String[] args) {

        int uang = 100000;

        System.out.println("Uang awal: Rp" + uang);

        uang -= 25000; 
        System.out.println("Setelah beli baju: Rp" + uang);
        uang += 20000; 
        System.out.println("Setelah mendapat uang: Rp" + uang);
        uang *= 2;
        System.out.println("Setelah dikali 2: Rp" + uang);
        uang /= 2;
        System.out.println("Setelah dibagi 2: Rp" + uang);
    }
}
