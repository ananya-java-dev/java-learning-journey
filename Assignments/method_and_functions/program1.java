package Assignments.method_and_functions;

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        //Q.Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
        Scanner in=new Scanner(System.in);
        System.out.print("enter num1:" );
        int num1=in.nextInt();
        System.out.print("enter num2:");
        int num2=in.nextInt();
        System.out.print("enter num3:");
        int num3=in.nextInt();
        System.out.print("maximum/largest number :");
        max(num1,num2,num3);
        System.out.print("minimum/smallest number:");
        min(num1,num2,num3);
    }
    //method1 to print maximum number
    static void max(int x,int y, int z) {
        if (x > y && x > z) {
            System.out.println(x);
        } else if (y > z && y > x) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }
    }
        static void min(int x,int y, int z) {
            if (x < y && x < z) {
                System.out.println(x);
            } else if (y < z && y < x) {
                System.out.println(y);
            } else {
                System.out.println(z);
            }
        }
}
