package ru.imbabot.lesson3;

import java.util.Arrays;
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

    private static void guessWord() {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String guessWord = words[0 + (int) (Math.random() * words.length)];

        while (true) {
            System.out.println("Enter guess word");
            String word = scanner.next();
            String[] temp = new String[]{"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"};
            System.out.println(temp.length);
            if (word.equals(guessWord)) {
                System.out.println(guessWord);
                System.out.println("win");
                break;
            } else if (!word.equals(guessWord)) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guessWord.charAt(i)) {
                        temp[i] = String.valueOf(word.charAt(i));
                    }
                }
                System.out.println(Arrays.toString(temp));
            }
        }
    }

    public static void main(String[] args) {
        guessWord();
    }
}
