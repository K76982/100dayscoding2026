public class Day31 {
    public static void main(String[] args) {

        int umur = 20;
        boolean punyaKTP = true;

        System.out.println(umur >= 17 && punyaKTP == true);
        System.out.println(umur >= 17 || punyaKTP == false);
        System.out.println(!(umur >= 17));
    }
}
