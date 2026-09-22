public class Day21 {
    public static void main(String[] args) {

        String angka1 = "100";
        String angka2 = "1000";
        String angka3 = "10";
        String angka4 = "1000";
        String angka5 = "85.5";
        String angka6 = "85.5";
        String benar = "true";
        String huruf = "A";

        byte dataByte = Byte.parseByte(angka1);
        short dataShort = Short.parseShort(angka2);
        int dataInt = Integer.parseInt(angka3);
        long dataLong = Long.parseLong(angka4);
        float dataFloat = Float.parseFloat(angka5);
        double dataDouble = Double.parseDouble(angka6);
        boolean dataBoolean = Boolean.parseBoolean(benar);
        char dataChar = huruf.charAt(0);

        System.out.println("byte    : " + dataByte);
        System.out.println("short   : " + dataShort);
        System.out.println("int     : " + dataInt);
        System.out.println("long    : " + dataLong);
        System.out.println("float   : " + dataFloat);
        System.out.println("double  : " + dataDouble);
        System.out.println("boolean : " + dataBoolean);
        System.out.println("char    : " + dataChar);
    }
}
