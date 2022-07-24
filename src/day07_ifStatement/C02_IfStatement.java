package day07_ifStatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        // Kullanicidan bir gun ismi alin ve gunun hafta ici mi hafta sonu mu oldugunu yazdirin

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen bir gun ismi girin");

        String gun=scan.next();

        if (gun.equalsIgnoreCase("pazartesi") || gun.equalsIgnoreCase("sali") || gun.equalsIgnoreCase("carsamba")||
                gun.equalsIgnoreCase("persembe") || gun.equalsIgnoreCase("cuma")){
            System.out.println("girdiguiniz gun; " +gun + " Hafta ici bir gundur");
        } else {
            System.out.println("girdiguiniz gun; " +gun + " Hafta sonu bir gundur");
        }

    }
}
