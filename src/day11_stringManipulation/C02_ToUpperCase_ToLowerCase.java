package day11_stringManipulation;

import java.util.Locale;

public class C02_ToUpperCase_ToLowerCase {
    public static void main(String[] args) {

        String str= "Java Guzeldir";

        // Biz string methodlerini arka arkaya kullanabiliriz
        // mesele ikinci kelimenin ilk harfini kucuk olarak yazdiralim

        System.out.println(str.toLowerCase().charAt(5)); // g

        System.out.println(str.toUpperCase());  // JAVA GUZELDIR
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));  // JAVA GUZELDİR (Turkce karakte ile)

        System.out.println(str.toLowerCase());  // java guzeldir

        String name= "Ali Can";
        String isim="Ali Can";
        String ad= "ali can";

        System.out.println(name.toLowerCase().equals(ad)); // true

        System.out.println(name.equals(isim)); // true

    }
}
