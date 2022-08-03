package day17_forloop;

import java.util.Scanner;

public class SoruStringTesCevirme {
    public static void main(String[] args) {

        // Kullanicidan bir string al, stringi tersten yazan bir method yaz

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir string gir loo");
        String str=scan.next();

        terstenYaz(str);

    }

    private static void terstenYaz(String str) {
        for (int i = 0; i <= str.length()-1; i++) {
            String tersStr="";
            tersStr+=str.charAt(str.length()-1-i);
            System.out.print(tersStr);
        }
    }

}
