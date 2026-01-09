package array;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        System.out.println("Take array input from user");
        Scanner in=new Scanner(System.in);
       int[] arr= new int[4];
        System.out.print("enter elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("elements:");
        for(int i=0;i <arr.length;i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
