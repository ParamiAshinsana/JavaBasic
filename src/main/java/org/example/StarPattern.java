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

        method02();
    }

    public static void method01(){
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

    public static void method02(){
        for (int i = 0; i <= 10; i++){              //<----- 1 st for loop
            for (int j =0; j <=10-i; j++){           //<----- 2nd for loop
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){             //<----- 3 rd for loop
                System.out.print("* ");
            }

            System.out.println();
        }

    }


}
