package day10_switchCase;

public class C01_SwitchCase {
    public static void main(String[] args) {

        int sayi = 3;

        switch (sayi) {
            case 1:
                System.out.println("sayi=1");
                break;
            case 2:
                System.out.println("sayi=2");
                break;
            case 3:
                System.out.println("sayi=3");
                break;
            case 4:
                System.out.println("sayi=4");
                break;
            default:
                System.out.println("sayi bunlardan biri degil");
        }
    }
}
