package day11_stringManipulation;

import java.util.Scanner;

public class C04_Length {

    public static void main(String[] args) {

        String isim="Ali Can";

        System.out.println(isim.charAt(isim.length() - 1));  // n

        System.out.println(isim.length()); // 7

       // Kullanicidan ismini alip bas harfini ve son harfini buyuk yazdir

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen adini yaz");
        String ad=scan.nextLine();
        System.out.println("Soyadini da yazsana lo dirrro");
        String soyad= scan.next();

        System.out.println("Adinizin bas harfi : " + ad.toUpperCase().charAt(0));
        System.out.println("Adinizin son harfi : " + ad.toUpperCase().charAt(ad.length() - 1));
        System.out.println("Soyadinizin bas harfi : " + soyad.toUpperCase().charAt(0));
        System.out.println("Soyadinizin son harfi : " + soyad.toUpperCase().charAt(soyad.length() - 1));

    }
}
