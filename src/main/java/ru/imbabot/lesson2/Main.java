package ru.imbabot.lesson2;


import java.util.Arrays;

public class Main {

    private static void fillDiagonal(int[][] arr) {
        int first = 0;
        int second = arr.length;

        while (first < arr.length) {
            arr[first][first] = 1;
            first++;
        }

        while (first < arr.length) {
            arr[first][second] = 1;
            first++;
            second--;
        }
    }


    private static void lessThenSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
    }

    private static void changeNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
//        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        changeNumbers(arr);
//        System.out.println(Arrays.toString(arr));
//
//        int[] arr = new int[8];
//        fillArr(arr);
//        System.out.println(Arrays.toString(arr));
//
//        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        lessThenSix(arr);
//        System.out.println(Arrays.toString(arr));

        int[][] arr = new int[5][5];
        fillDiagonal(arr);

        System.out.println(Arrays.deepToString(arr));


    }
}
