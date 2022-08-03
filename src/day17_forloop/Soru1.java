package day17_forloop;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        // palindrom mu kune??

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string gir loo");
        String str = scan.next();

        palindromKontrol(str);
        
    }

    private static void palindromKontrol(String str) {

        String tersStr="";
        for (int i = 0; i <= str.length()-1; i++) {

            tersStr+=str.charAt(str.length()-1-i);

        }

        if (str.equals(tersStr)){
            System.out.println("Palindrom");
        }else {
            System.out.println("palindrom degil");
        }
    }

}
