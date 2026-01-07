package Assignments.method_and_functions;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        //Q.Write a program that will ask the user to enter his/her marks (out of 100).
        // Define a method that will display grades according to the marks entered as below:
        //Marks        Grade
        //91-100         AA
        //81-90          AB
        //71-80          BB
        //61-70          BC
        //51-60          CD
        //41-50          DD
        //<=40          Fail
        while(true) {
            Scanner in = new Scanner(System.in);
            System.out.print("enter marks(out of 100):");
            int marks = in.nextInt();
            grade(marks);
        }
    }
    static void grade(int num){
        if(num>0 && num<100) {
            if (num >= 91) {
                System.out.println("AA");
            } else if (num >= 81) {
                System.out.println("AB");
            } else if (num >= 71) {
                System.out.println("BB");
            } else if (num >= 61) {
                System.out.println("BC");
            } else if (num >= 51) {
                System.out.println("CD");
            } else if (num >= 41) {
                System.out.println("DD");
            } else {
                System.out.println("Fail");
            }
        }else {
            System.out.println("Invalid marks !!try again");
            System.out.println();
        }


    }
}
