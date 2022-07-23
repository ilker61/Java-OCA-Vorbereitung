package day05_increment;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {

       // kullanicidan aldiginiz 4 basamakli sayinin rakamlar toplamini bul

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen dört basamakli bir sayi gir");
        int rakam=scan.nextInt();

        int rakamlarToplami=0;

        rakamlarToplami=rakam%10; //7
        rakam=rakam/10; // 452

        rakamlarToplami+=rakam%10; // 9
        rakam= rakam/10; //45

        rakamlarToplami+=rakam%10; //14
        rakam=rakam/10; // 4

        rakamlarToplami+=rakam;

        System.out.println(rakamlarToplami);
    }
}
