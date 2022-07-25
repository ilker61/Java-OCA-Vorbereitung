package day09_tenaryOperatorr;

public class C02_Ternary {

    public static void main(String[] args) {

        int sayi=3456;
        // verilen sayinin 3 basamakli ve ya dahacok basamakli olup olmadigini kontrol eden bir ternary yaz

        String sonuc = sayi>=100 ? "sayi 3 basamakli veya daha buyuk" : "sayi negatif veya 3 basamaktan guccuk";

        // ternary bize sonuc dondurur, bu nedenle bunu ya yazdiririz yada atama yaparik
        System.out.println(sonuc);


    }
}
