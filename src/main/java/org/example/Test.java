package org.example;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Your Number : ");
        double number = scanner.nextDouble();

        double inch = number/25.4;
        System.out.println(inch+" mm");
    }
}
