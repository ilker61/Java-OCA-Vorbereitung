package day11_stringManipulation;

public class C01_Concat_CharAt {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzeldir";

        System.out.println(str1 + " " + str2); //  Java Guzeldir
        System.out.println(str1.concat(" ").concat(str2)); // Java Guzeldir

        String yazi= "Bu yaz havalar cok sicak";

        System.out.println(yazi.charAt(0)); // B

        // 15. indexdeki c harfini buyuk yazdir

        System.out.println(yazi.toUpperCase().charAt(15));  // C


    }
}
