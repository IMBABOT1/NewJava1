package ru.imbabot.lesson1;

public class Main {

    public static void main(String[] args) {
        System.out.println(hello("Name"));
    }

    private static void init() {
        byte a = 1;
        short b = 2;
        int c = 4;
        long l = 8;

        float f = 10.5f;
        double d = 10.10;

        char ch = 'c';
        boolean bool = true;
    }

    private static int calculate(int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    private static boolean limit(int first, int second){
        int result = first + second;
        return result >= 10 && result <= 20;
    }

    private static void isPositive(int value){
        if (value >= 0){
            System.out.println("positive");
        }else {
            System.out.println("Negative");
        }
    }

    private static boolean reverse(int value){
        return value < 0;
    }

    private static String hello(String name){
        return "Hello," + " " + name;
    }

    private static boolean isLeap(int year){
        return  ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }
}
