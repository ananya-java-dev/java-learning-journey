package datatypes;

import java.util.Scanner;

// making a basic calculator
public class simplearithmetic {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("enter value 1:");
         double x=input.nextDouble();
         System.out.print("enter value 2:");
         double y=input.nextDouble();
         System.out.println("sum="+(int)(x+y));
         System.out.println("difference="+(x-y));
         System.out.println("product="+(x*y));
         System.out.println("division="+(x/y));
         System.out.println("modulo="+(x%y));
         System.out.println(x>y);
         System.out.println(x<y);
         System.out.println(x==y);//comparison of return type of variables
         System.out.println(x!=y);


    }

}
