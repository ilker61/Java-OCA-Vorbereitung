package day12_stringManipulation;

import java.util.Scanner;

public class C03_ReplaceAll {

    public static void main(String[] args) {

     // Kullanicidan isim soy isim al ve butun harfleri * yap

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soy isminizi yazin");
        String name= scan.nextLine();

        System.out.println(name.replaceAll("\\S", "*"));
        // veya
        System.out.println(name.replaceAll("\\w", "*"));


    }
}
