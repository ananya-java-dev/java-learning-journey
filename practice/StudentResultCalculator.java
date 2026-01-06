package practice;

import java.util.Scanner;

public class StudentResultCalculator {
    public static void main(String[] args) {
        System.out.println("-------STUDENT RESULT-------");
        Scanner input = new Scanner(System.in);
        System.out.print("Student name:");
        String name =input.nextLine();
        System.out.print("Enter name of Subject 1:");
        String subject1=input.nextLine();
        System.out.print("Enter makes of "+subject1+":");
        float no1= input.nextFloat();
         input.nextLine();
        System.out.print("Enter name of Subject 2:");
        String subject2 = input.nextLine();
        System.out.print("Enter marks of "+subject2+":");
        float no2 = input.nextFloat();
        input.nextLine();
        System.out.print("Enter name of Subject 3:");
        String subject3 =input.nextLine();
        System.out.print("Enter marks of " +subject3+ ":");
        float no3 = input.nextFloat();
        input.nextLine();
        float total=no1+no2+no3;
        System.out.println("total marks:300");
        System.out.println("total marks obtained:"+total);
        float percentage=(total/300)*100;
        System.out.println("Result:"+percentage+"%");
    }
}
