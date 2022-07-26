package day11_stringManipulation;

public class C02_ToUpperCase_ToLowerCase {
    public static void main(String[] args) {

        String str= "Java Guzeldir";

        // Biz string methodlerini arka arkaya kullanabiliriz
        // mesele ikinci kelimenin ilk harfini kucuk olarak yazdiralim

        System.out.println(str.toLowerCase().charAt(5)); // g

        System.out.println(str.toUpperCase());  // JAVA GUZELDIR

        System.out.println(str.toLowerCase());  // java guzeldir




    }
}
