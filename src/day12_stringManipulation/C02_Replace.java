package day12_stringManipulation;

public class C02_Replace {
    public static void main(String[] args) {
        String str="Bugun ne cok sey ogrendik";  // 25

        // bu cumlede bosluk disinda karakter sayisini yazdir

        System.out.println(str.replace(" ", "").length());  // 21

        // ne kelimesini cumleden cikar

        // Not= KALICI DEGISIKLIK ICUN ATAMA YAPMALIYIZ

        str=str.replace("ne ", "");
        System.out.println(str);

        // ATAMA YOKSA KALICI DEGISIKLIK TE YOG

    }
}
