package day09_tenaryOperatorr;

public class C03_NestedTernary {
    public static void main(String[] args) {

       // verilen sayinin poz. veya neg. oldugunu kontrol edip
        // 0 ve pozitifse tek veya cift mi
        // negatif ise -100 den buyuk veya guccuk oldugunu kontrolunu sagla

        int sayi=-12;
        System.out.println(sayi >= 0 ? sayi % 2 == 0 ? "cift" : "tek" : sayi >= -100 ? "-100 veya buyuk" : "-100 veya kucuk");

    }
}
