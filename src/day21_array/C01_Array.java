package day21_array;

import java.sql.Array;
import java.util.Arrays;

public class C01_Array {
    public static void main(String[] args) {
        int arr [] ={5,2,3};
        int arr1[]= new int[3];
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0] + ", "  + arr[1] + ", " + arr[2] );

        for (int i = 0; i <3 ; i++) {
            System.out.print(arr[i] + "  ");
        }

    }
}
