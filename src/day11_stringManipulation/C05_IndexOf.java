package day11_stringManipulation;

import java.util.Scanner;

public class C05_IndexOf {
    public static void main(String[] args) {

        String str1="Java bir baska guzel";
        System.out.println(str1.indexOf('a'));  // 1

        System.out.println(str1.indexOf("l"));  // 19

        System.out.println(str1.length()-1); // 19

        System.out.println(str1.indexOf("bir")); // 5


        // Soru; Kullanicidan bir cumle ve bir kelime iste.
        // kelime cumlenin icinde varmi kontrol et

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");

        String cumle=scan.nextLine();

        System.out.println("Lutfen bir kelime giriniz");

        String kelime=scan.next();

        if (cumle.contains(kelime)){
            System.out.println("cumle kelimeyi iceriyor");
        }
        else {
            System.out.println("cumle kelimeyi icermiyi");
        }



    }
}
