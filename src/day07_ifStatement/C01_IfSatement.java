package day07_ifStatement;

import java.util.Scanner;

public class C01_IfSatement {
    public static void main(String[] args) {

    int a=10;
    int b=20;

    if (a<b && b<100){
        System.out.println("isleminiz gerceklesecek");
    }

    if (a>5) System.out.println("suslu parantez olmazsa sadece bir satir calisir");

    // Kullanicidan bir sayi iste ve sayinin cift veya tek oldugunu yazdir

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen bir sayi girin");

        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("girdiginiz sayi cifttir");
        } else {
            System.out.println("girdiginiz sayi tekdir");
        }



    }
}
