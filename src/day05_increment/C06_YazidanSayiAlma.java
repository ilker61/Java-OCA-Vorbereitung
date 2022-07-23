package day05_increment;

public class C06_YazidanSayiAlma {
    public static void main(String[] args) {

        String yazi= "adamin numarasi 4527 imis";

        int ilkSpace=yazi.indexOf(" ");
        int ikinciSpace= yazi.indexOf(" ", ilkSpace+1);
        int ucuncuSpace= yazi.indexOf(" " , ikinciSpace+1);

        String sayiYazi=yazi.substring(ikinciSpace+1, ucuncuSpace);
        System.out.println(sayiYazi);

        int sayiSayi=Integer.valueOf(sayiYazi);
        System.out.println(sayiSayi);

    }
}
