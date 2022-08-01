package day13_stringManipulation;

public class C01_Substring {
    public static void main(String[] args) {

        String str="Java ile IT cok guzel";

        System.out.println(str.substring(0, 1).replace("J", "x"));
        System.out.println(str);

       // System.out.println(str.substring(5,2)); // Exception in thread "main" java.lang.StringIndexOutOfBoundsException

        System.out.println(str.substring(str.length()-1)); // l
        System.out.println(str.substring(str.length())); // hiclik verir ""

    }
}
