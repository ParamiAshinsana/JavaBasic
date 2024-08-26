package org.example;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    static Random random = new Random();
    public static void main(String[] args) {

//        method01();
        method02();
    }

    private static void method01() {
//        Random random = new Random();
        int randomNo1 = random.nextInt(10);
        System.out.println(randomNo1);

    }

    private static void method02() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter username :");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);

        for (int i = 0; i < 3; i++) {
            System.out.print("your name : ");
            String firstName = myObj.nextLine();
            System.out.println("name "+""+i+":"+firstName);
        }
    }
}
