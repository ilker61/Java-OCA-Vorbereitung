package day06_concatenation;

import java.util.Scanner;

public class C01_Concatenation {
    public static void main(String[] args) {

        // Kullanicidan alinan 4 basamakli sayinin rakamlar toplamini bul

        Scanner scan= new Scanner(System.in);

        System.out.println("4 basamkli bir sayi gir");

        int sayi=scan.nextInt();

        int rakamlarToplami=0;

        // sayi 6789 olsun

        /*

        1. yol

        rakamlarToplami+=sayi%10;  // 9
        sayi/=10; // 678

        rakamlarToplami+=sayi%10; // 17
        sayi/=10; // 67

        rakamlarToplami+=sayi%10; // 24
        sayi/=10; // 6

        rakamlarToplami+=sayi%10; // 30
        sayi/=10; // 0

        System.out.println(rakamlarToplami);

         */


        // 2. yol

        for (int i = 0; i <= sayi; i++) {
            rakamlarToplami+=sayi%10;
            sayi/=10;
        }
        System.out.println(rakamlarToplami);








    }
}
