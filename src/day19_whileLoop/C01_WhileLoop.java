package day19_whileLoop;

public class C01_WhileLoop {

    public static void main(String[] args) {

      // Kullanicidan bir sayi alin ve
      // bu sayiyi tam bolen sayilari ve toplam kac sayi olduklarini ekranda yazdirin

      int input= 75;

      int bolen=1;

      int sayac=1;

        while (bolen<=input){
            if (input%bolen==0){
                System.out.print(bolen +" ");
                sayac++;
            }
            bolen++;
        }
        System.out.println("");
        System.out.println(input + " sayisini bolen " + sayac + " dene sayi var ya laa");

    }
}
