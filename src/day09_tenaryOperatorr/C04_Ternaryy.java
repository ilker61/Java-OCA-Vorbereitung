package day09_tenaryOperatorr;

public class C04_Ternaryy {
    public static void main(String[] args) {

        // Bazen ternary deki sonuc bir den fazla data type sahip olabilu
        // bu durumda atama yapilabilinemez. SADECE YAZDIRILABILIR

        // verile sayi 100 den buyukse sayinin karesini al ve yazdir
        // 100 den kucukse "sayi 100 den buyuk olmali" yazdir

        int sayi=500;

        System.out.println(sayi > 100 ? sayi * sayi : "sayi 100 den buyuk olmali");
    }
}
