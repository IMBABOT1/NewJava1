package ru.imbabot.lesson3;

import java.util.Scanner;

public class Main {

    private static void guessNumber() {
        int again = 0;

        do {
            int tries = 3;
            int number = 0 + (int) (Math.random() * 10);
            while (tries > 0) {
                System.out.println("Enter guess number");
                Scanner sc = new Scanner(System.in);
                int tryNumber = sc.nextInt();
                if (tryNumber == number) {
                    System.out.println("win");
                    break;
                } else if (tryNumber > number) {
                    tries--;
                    System.out.println("number is less you have " + tries + " tries");
                } else if (tryNumber < number) {
                    tries--;
                    System.out.println("number is greater you have tries " + tries + " tries");
                }
            }

            System.out.println("Play again? 1-y 2-n");
            Scanner scanner = new Scanner(System.in);
            again = scanner.nextInt();
        } while (again == 1);
    }

    public static void main(String[] args) {
        guessNumber();
    }
}
