package day17_forloop;

import java.util.Scanner;

public class SoruFaktoryel {
    public static void main(String[] args) {

        // Kullanicidan 10 dan kucuk bir sayi al ve onun faktoryelini hesab eyle

        Scanner scan = new Scanner(System.in);
        System.out.println("10 dan kucuk bir sayi dehle");
        int sayi=scan.nextInt();
        int faktoryel=1;

        for (int i = sayi; 1<=i ; i--) {

            faktoryel*=i;
        }
        System.out.println(sayi+"!" + " =" +faktoryel);

    }
}
