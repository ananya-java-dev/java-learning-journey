package array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
   static  Scanner in=new Scanner(System.in);
   public static void main(String[] args) {
       int[] arr={2,4,6,8};
       System.out.println("initial array:"+Arrays.toString(arr));
       for(int i=0;i<arr.length;i++){
           arr[i]=arr[i]*2;
       }
       System.out.print("updated array:"+ Arrays.toString(arr));
   }
   /* public static void main(String[] args) {
        //array practice
        System.out.println("---array with n elemnts and print array elements with index--");
        // here we are going to take no. of elements from user too
        int n;
       do{

           System.out.print("enter no. of elements:");
            n = in.nextInt();
           if (n < 0) {
               System.out.println("invalid number please enter correct number");
           }
       }while(n<=0);
        int[] arr=new int[n];
        System.out.print("enter elements of array:");
        for (int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("--resultant array");
        for (int i=0;i< arr.length;i++){
            System.out.println("index:"+i+","+"element:"+arr[i]);
        }
       // reversal of arr
        reverse(arr);
        //sum of array elements using method
        sum(arr);
        // count even numbers in an array
       int c= counter(arr);
       System.out.print("even numbers in array:"+c);
        // largest element in an array
        max(arr);
    }

    */
    static void reverse(int[] arr){
        for (int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    static void sum(int[] n){
        int sum = 0;
        for (int i=0;i<n.length;i++){
            sum+=n[i];
        }
        System.out.println("sum="+sum);
    }
    static int counter(int[] n){
        int count=0;
        int i=0;
        while(i!=n.length) {//or i<n.length both conditions are right
            if (n[i] % 2 == 0) {
                count += 1;
            }
            i++;
        }
        return count;
    }
    static void max(int[] n){
        int max=n[0];
        for (int i=1;i<n.length;i++){
            if(max<n[i]) {
                max =n[i];
            }
        }
        System.out.println("max element:"+max);
    }
}
