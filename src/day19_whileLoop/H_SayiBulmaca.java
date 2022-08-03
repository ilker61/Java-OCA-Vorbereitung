package day19_whileLoop;

import java.util.Random;
import java.util.Scanner;

public class H_SayiBulmaca {
    public static void main(String[] args) {

        // Bilgisayara 1 ila 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi kucult yaki buyult deyu kullaniciya yol goster
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya sulesin

        Random rnd=new Random();
        int sayi=rnd.nextInt(100);

        Scanner scan= new Scanner(System.in);

        int tahmin=0;
        int sayac=0;

        while (sayi!=tahmin){
            System.out.println("Lutfi bir sayi gir loo");
            tahmin=scan.nextInt();
            if (tahmin>sayi){
                System.out.println("Kucult lo hirbo");

            } else if (tahmin<sayi){
                System.out.println("Buyult la hirbo");

            }
            sayac++;
        }
        System.out.println("Tuttugun sayi " + sayac + " tahminde buldun");



    }
}
