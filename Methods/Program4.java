package Methods;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        System.out.println("--factorial calculator--");
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number:");
        int fact =in.nextInt();
        int factorial=fact(fact);
        System.out.print("factorial:"+factorial);
    }
    static int fact(int num){
        if(num==0||num==1){
            return 1;
        }
        int factorial= num * fact(num-1);
        return factorial;
    }
}
