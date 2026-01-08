package Methods;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        System.out.println("--sum of first n numbers--");
        System.out.print("enter value of n:");
        Scanner in=new Scanner(System.in);
        int n =in.nextInt();
        System.out.print("output:"+sum(n));
    }
    static int sum(int num){
        if (num==0||num==1){
            return 1;
        }
        int add= num+sum(num-1);// 6+5+4+3+2+1=21
        return add;

    }
}
