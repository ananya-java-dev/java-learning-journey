package practice;

import java.util.Scanner;

public class ModifiedCalUsingLoop {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int ans =0;
        while(true){
        System.out.print("enter numbers:");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.print("enter the operation:");
        char op=in.next().trim().charAt(0);
        if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
            if(op=='+'){
                ans=a+b;
                System.out.println("sum="+ans);
            }
            if (op == '-') {
                ans=a-b;
                System.out.println("difference="+ans);
            }
            if (op=='*') {
                ans=a*b;
                System.out.println("product="+ans);
            }
            if (op == '/') {
                if(b!=0){
                    ans=a/b;
                    System.out.println("division:"+ans);
                }
            }if(op=='%'){
                ans=a%b;
                System.out.println("modulo:"+ans);
            } else if (op== 'x' ||op=='X') {
                break;
            }
            }else{
                System.out.println("Invalid Operator");
                System.out.println("TRY AGAIN!!");
            System.out.println();
            }
        }
    }
}
