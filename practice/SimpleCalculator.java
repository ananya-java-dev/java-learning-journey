package practice;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("--BASIC CALCULATOR--");
        System.out.print("enter 1st no.:");
        double num1=in.nextDouble();
        System.out.print("enter no.2:");
        double num2=in.nextDouble();
        System.out.println("--Select Operation--");
        System.out.println("1.Sum");
        System.out.println("2.Difference");
        System.out.println("3.Division");
        System.out.println("4.Multiply");
        System.out.println("5.Modulo");
        int choice = in.nextInt();
        if(choice==1){
            double sum =num1+num2;
            System.out.println("Sum="+sum);
        }else if (choice==2){
            double diff=num1-num2;
            System.out.println("difference="+diff);
        }else if (choice==3){
            double div=num1/num2;
            System.out.println("division="+div);
        }else if (choice==4){
            double mul=num1*num2;
            System.out.println("multiply:"+mul);
        } else if(choice==5){
            double mol=num1%num2;
            System.out.println("Modulo:"+mol);
        }else{
            System.out.println("OOPS!! INVALID CHOICE");
            System.out.println("TRY AGAIN!");
        }
    }
}
