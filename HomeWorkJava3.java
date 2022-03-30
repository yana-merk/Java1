/**
* Java 1. Homework 3
*
* @author Yana Merkulova
* @version 30.03.2022
*/

import java.util.Arrays;
import java.util.Random;

class HomeWorkJava3 {
    public static void main(String[] args) {
        array01();
        array100();
        changeArray();
        fillDiagonal();
        returnArr(4, 8);
    }
    
    static void array01() {
        int[] arr = {1, 0, 1, 1, 0, 0, 0, 1, 1};
            System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++)
            arr[i] = (arr[i] == 0) ? 1 : 0;
                System.out.println(Arrays.toString(arr));
    }
    
    static void array100() {
        int [] arr = new int [100];
        arr[0] = 0;
        for (int i = 0; i < arr.length; i++)
            arr [i] = i + 1;
        System.out.println(Arrays.toString(arr));
    }
    
    static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr [i] *=2;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    static void fillDiagonal() {
        int counter = 1;
        int[][] table = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][i] = 1;
                table[i][3 - i - 1] = 1;
                System.out.print(table[i][j] + " ");
                //counter++;
            }
            System.out.println();
        }
    }
    
    static void returnArr(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i  + "]" + arr[i] + " ");
        }
        System.out.println();
    }
}