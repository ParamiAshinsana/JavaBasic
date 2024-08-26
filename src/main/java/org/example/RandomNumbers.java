package org.example;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    static Random random = new Random();
    public static void main(String[] args) {

//        method01();
        guessTheNumber();
    }

    private static void method01() {
//        Random random = new Random();
        int randomNo1 = random.nextInt(10);
        System.out.println(randomNo1);

    }

    private static void guessTheNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1;
        int attempts = 3;

        System.out.println("Guess the number (1 to 10)! You have " + attempts + " tries.");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Try " + i + ": ");
            int guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Wow! You guessed it right!");
                break;
            } else if (i == attempts) {
                System.out.println("Oops! Out of tries. The number was " + randomNumber + ".");
            } else {
                System.out.println("Nope, try again!");

            }

        }

        scanner.close();
    }
}
