package day16_methodCreation;

public class C01_Overloading {
    public static void main(String[] args) {

        int sayi1=3;
        int sayi2=4;

        ikiSayiyiTopla(sayi1, sayi2);

        double sayi3=4.5;
        double sayi4=3.2;

        ikiSayiyiTopla(sayi3, sayi4);

        int sayi5=5;
        double sayi6=4.6;

        ikiSayiyiTopla(sayi5, sayi6);  // double method calisir

    }

    private static void ikiSayiyiTopla(double sayi3, double sayi4) {
        System.out.println("double method calisti. toplam ; " + (sayi3 + sayi4));
    }

    private static void ikiSayiyiTopla(int sayi1, int sayi2) {
        System.out.println("int method calisti. toplam ; " + (sayi1 + sayi2));
    }


}
