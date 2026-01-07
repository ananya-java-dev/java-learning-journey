package Assignments.method_and_functions;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        //Q.Write a program to print the factorial of a number by defining a method named 'Factorial'.
        // Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
        // E.g.-
        //4! = 1 * 2 * 3 * 4 = 24
        //3! = 3 * 2 * 1 = 6
        //2! = 2 * 1 = 2
        //Also,
        //1! = 1
        //0! = 1
        Scanner in =new Scanner(System.in);
        System.out.print("enter the number you want to find the factorial of :");
        int num=in.nextInt();
        System.out.println("factorial:"+factorial(num));
    }
    static int factorial(int num) {
        if (num == 1 || num==0) {
            return 1;
        }
            int fact = num * factorial(num-1);
        return fact;
    }
}
