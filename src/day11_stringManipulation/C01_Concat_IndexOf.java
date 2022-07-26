package day11_stringManipulation;

public class C01_Concat_IndexOf {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzeldir";

        System.out.println(str1 + " " + str2); //  Java Guzeldir
        System.out.println(str1.concat(" ").concat(str2)); // Java Guzeldir

        String yazi= "Bu yaz havalar cok sicak";

        System.out.println(yazi.indexOf("B")); // 0




    }
}
