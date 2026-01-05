package conditionandloops;

import java.util.Scanner;

public class ProgramTwo {
     public static void main(String[] args) {
         System.out.println("sum of first n numbers");
         Scanner in=new Scanner(System.in);
         System.out.print("Enter the value of n:");
         int n=in.nextInt();

         int sum=n*(n+1)/2;
         System.out.println("sum of numbers upto "+n+" = "+sum);
    }
}
