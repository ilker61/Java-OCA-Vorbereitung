package day08_ternaryOperator;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        // Girilen bir karakterin harf olup olmadigini bulalim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter girin");

        char karakter=scan.next().charAt(0);

        if((karakter>='A' && karakter<='Z')  || (karakter>='a' && karakter<='z') ){
            System.out.println("Girdiginiz karakter bir harf");
        } else {
            System.out.println("Girdiginiz her ne nane ise harf degildur");
        }

    }
}
