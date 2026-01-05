package conditionandloops;

import java.util.Scanner;

public class ProgramThree {
    public static void main(String[] args) {
        System.out.println("print Even numbers upto n");
        Scanner in=new Scanner(System.in);
        System.out.println("enter n:");
        int n=in.nextInt();
        int i=0;
        while(i<=n){
             if(i%2==0) {
                 System.out.println(i);
             }i++;
        }
    }
}
