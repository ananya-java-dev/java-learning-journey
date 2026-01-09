package array;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        System.out.println("Sum & average of array elements");
        input();
    }
    static void input() {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.print("enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
       int s= sum(arr);
        System.out.println("sum="+s);
        double a=average(arr);
        System.out.println("average="+a);
    }
     static int sum(int[] num){
        int sum=0;
        for (int i=0;i< num.length;i++){
            sum+=num[i];
        }
        return sum;
    }
       static double average(int[] d){
        double avg=sum(d)/d.length ;
        return avg;
      }
}
