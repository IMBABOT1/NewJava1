package ru.imbabot.lesson2;

import java.util.Arrays;

public class Main {

    private static void changeNumbers(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                arr[i] = 1;
            }else if (arr[i] == 1){
                arr[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        changeNumbers(arr);
        System.out.println(Arrays.toString(arr));
    }
}
