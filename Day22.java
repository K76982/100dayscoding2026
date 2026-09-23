public class Day22 {
    public static void main(String[] args) {

        int nilai1 = 10;
        int nilai2 = 20;

        System.out.println("Sebelum ditukar: " + nilai1 + " dan " + nilai2);

        int sementara = nilai1;
        nilai1 = nilai2;
        nilai2 = sementara;

        System.out.println("Setelah ditukar: " + nilai1 + " dan " + nilai2);
    }
}
