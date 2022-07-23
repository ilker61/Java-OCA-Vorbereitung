package day05_increment;

public class C04_WrapperClass {
    public static void main(String[] args) {

        // primitiv dta turu ile non-primitiv arasindaki farklar nelerdir?


        double sayi1=10.8;
        Double sayi2=10.5;

        System.out.println(sayi2.toString());
        System.out.println(sayi2.equals(10.5));

        short sayi3=20;
        Short sayi4=30;

        sayi4=sayi3;
        System.out.println(sayi4);
        System.out.println(Short.MAX_VALUE); // 32767
        System.out.println(Short.MIN_VALUE); //  -32768
        System.out.println(Short.BYTES);     // 2Byte = 16 bit

    }
}
