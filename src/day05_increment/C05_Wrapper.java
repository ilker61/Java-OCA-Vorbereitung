package day05_increment;

public class C05_Wrapper {
    public static void main(String[] args) {

        String str1="12345";
        String str2="23456";

        // verilrn iki stringteki sayilari topla

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));

        String tcNo="45490807074";

        System.out.println(Long.valueOf(tcNo));

        String okulNo="4527";

        System.out.println(Integer.valueOf(okulNo));

        long sayiToplami= Long.valueOf(tcNo) + Integer.valueOf(okulNo);

        System.out.println(sayiToplami);
    }
}
