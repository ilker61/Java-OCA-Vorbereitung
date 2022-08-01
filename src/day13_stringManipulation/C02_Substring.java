package day13_stringManipulation;

public class C02_Substring {
    public static void main(String[] args) {

        // 1-48 von 109 Ergebnissen oder Vorschlägen für "nutella"

        // bu arama sonucundaki bulunan sonuc saysi 100 den cok ise super
        // az ise "az sonuc bulundu ya la" yazdirsin

        String str="1-48 von 109 Ergebnissen oder Vorschlägen für nutella";
        int ilkSpace=str.indexOf(" ");   //  4
        int ikinciSpace=str.indexOf(" ", ilkSpace+1);  // 8
        int ucuncuSpace=str.indexOf(" ", ikinciSpace+1);  // 12

        String sayiYazi=str.substring(ikinciSpace+1, ucuncuSpace);  // 109 ==> ama string halde

        int sayiSayi=Integer.valueOf(sayiYazi); // 109 ==> ama string halde

        if (sayiSayi>100){
            System.out.println("Zupi");
        } else {
            System.out.println("az sonuc bulundu ya la");
        }



    }
}
