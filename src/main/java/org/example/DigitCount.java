package org.example;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = scanner.nextInt();
        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num /= 10;
                count++;
            }
        }

        System.out.println("Count: " + count);

    }
}
