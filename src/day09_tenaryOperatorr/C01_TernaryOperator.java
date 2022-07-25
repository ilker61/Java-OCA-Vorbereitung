package day09_tenaryOperatorr;

import java.util.Scanner;

public class C01_TernaryOperator {
    public static void main(String[] args) {

        //Kullanicidan sayi al ve tek mi cift mi oldugunu yazdir sen hele bir

        Scanner scan=new Scanner(System.in);

        System.out.println("sayi gir siye loo");

        int sayi=scan.nextInt();

        System.out.println(sayi % 2 == 1 ? "sayi tek" : "sayi cift");


    }
}
