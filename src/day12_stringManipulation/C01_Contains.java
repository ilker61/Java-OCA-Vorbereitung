package day12_stringManipulation;

import java.util.Scanner;

public class C01_Contains {
    public static void main(String[] args) {

        //Kullanicidan email adresini girmesini iste
        // mail @gmail.com icermiyorsa "lutfen gmail adresi girin"
        // @gmail.com ile bitiyorsa "Email adresiniz kaydoldu" yazdirin
        // @gmail.com  ile bitmiyorsa "lutfen yaziyi kontrol edin" yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen mail adresini gir loo");

        String email=scan.next();

        String mail="@gmail.com";

        if (!email.contains(mail)){
            System.out.println("lutfen gmail adresi girin");
        }
        else if (email.endsWith(mail)){
            System.out.println("Email adresiniz kaydoldu");
        }
        else {
            System.out.println("lutfen yaziyi kontrol edin");
        }

    }
}
