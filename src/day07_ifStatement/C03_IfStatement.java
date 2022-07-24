package day07_ifStatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {

        // Kullanicidan yasini iste. 65 ve daha byuykse emekli et. degilse calissin daha

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen yasini gir");

        int yas=scan.nextInt();

        if (yas>=65){
            System.out.println("emekli olabilirsin");
        } else {
            System.out.println("Emekli olamazsin");
            System.out.println(65-yas + " sene daha calismalisin bro");
        }

    }

}
