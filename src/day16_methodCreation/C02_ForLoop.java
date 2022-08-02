package day16_methodCreation;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {

        // verili bir stringi tersine cevirme

        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime sule");

        String kelime=scan.next();

        for (int i = 0; i <= kelime.length()-1; i++) {
            String tersKelime="";
            tersKelime+=kelime.charAt(kelime.length()-1-i);
            System.out.print(tersKelime);
        }

        System.out.println("");


        // 2. yol

        for (int i = kelime.length()-1; i >=0 ; i--) {

            System.out.print(kelime.substring(i,i+1));

        }


    }
}
