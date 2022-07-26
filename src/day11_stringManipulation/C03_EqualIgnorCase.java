package day11_stringManipulation;

import java.util.Scanner;

public class C03_EqualIgnorCase {
    public static void main(String[] args) {

        // Kullaniciya derse katilip katilmak istemedigini sor
        // evet derse cevabi al. "Derse katiliminiz basariyla alinmistir" yaz
        // hayir ders ecevabi al ve "Sonraki derse bekleruk la duzzuk"

        Scanner scan= new Scanner(System.in);

        System.out.println("Derse katilacakmisin lo wirro" + "\nCevabi Evet yada Hayir seklinde yaz loo");

        String cevap=scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("Cevabin Evet" + "\nDerse katiliminiz basariyla alinmistir");
        } else if (cevap.equalsIgnoreCase("hayir")) {
            System.out.println("\"Cevabin Hayir lo hanzo" + "\nSonraki derse bekleruk la duzzuk\")");
        } else {
            System.out.println("Adam gibin bir cevap yaz lo dizzik");
        }


        // System.out.println(cevap=='e'?"Cevabin Evet" + "\nDerse katiliminiz basariyla alinmistir" : "Cevabin Hayir lo hanzo" + "\nSonraki derse bekleruk la duzzuk");

    }
}
