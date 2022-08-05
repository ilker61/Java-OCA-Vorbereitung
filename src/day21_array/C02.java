package day21_array;

import java.util.Arrays;

public class C02 {
    public static void main(String[] args) {

        int arr1[];

        arr1=new int[3];

        arr1[0]=2;
        arr1[1]=4;
        arr1[2]=6;

        for (int i = 0; i < 3; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.binarySearch(arr1, 6));

    }
}
