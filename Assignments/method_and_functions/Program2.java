package Assignments.method_and_functions;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        //Q.A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
        Scanner i =new Scanner(System.in);
        System.out.print("enter your age:");
        int age=i.nextInt();
        vote(age);
    }
    static void vote(int num){
        if(num>=18){
            System.out.println("congratulations!! you are eligible to vote.");
        }else {
            System.out.println("OOPS!!\nyou are not eligible to vote.");
        }
    }
}
