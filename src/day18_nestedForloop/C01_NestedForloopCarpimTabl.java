package day18_nestedForloop;

public class C01_NestedForloopCarpimTabl {

    // Kullanicidan bir rakkam alip carpim tablosu olusturaah

    public static void main(String[] args) {

        int input= 4;

        // 1  2  3        1*1    1*2   1*3
        // 2  4  6        2*1    2*2   2*3
        // 3  6  9        3*1    3*2   3*3

        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=3 ; j++) {
                System.out.print(i*j + "  ");
            }
            System.out.println("");
        }


    }
}
