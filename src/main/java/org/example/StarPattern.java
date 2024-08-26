package org.example;

public class StarPattern {
    public static void main(String[] args) {
//        for (int i = 0; i <10; i++) {
//            for (int j = 10; j>=i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k <=i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

        method1();
    }

    public static void method1(){
        for (int i = 0; i <= 10; i++){
            for (int j =0; j <=10 -i-1; j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i =0; i <=11-1; i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<11-i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
