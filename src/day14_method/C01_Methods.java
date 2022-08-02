package day14_method;

import java.util.Scanner;

public class C01_Methods {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfi 4 harfli bir kelime gir");

        String kelime=scanner.next();  // adem
        String tersKelime;

        for (int i = 0; i <=kelime.length()-1 ; i++) {

            tersKelime=kelime.substring(kelime.length()-i);
            System.out.println(tersKelime);
        }

    }
}
