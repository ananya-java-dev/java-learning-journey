package array.practice;

import java.util.Scanner;

public class Practice_level2 {
   /* static Scanner in=new Scanner(System.in);
      public static void main(String[] args) {
        //daily expense analyzer
        int[] arr=new int[7];
        base(arr);

      }
     static void base(int[] n){
        int i=0;
        while(i<n.length){
            System.out.print("enter expense of day  "+(i+1)+":");
            n[i]=in.nextInt();
            i++;
        }
        int sum=totalexpense(n);
        System.out.println("total expense:"+sum);
        more(n);
        max(n);
    }
    static int totalexpense(int[] n){
        int sum=0;
        for(int i=0;i<n.length;i++){
            sum+=n[i];
        }
        return sum;
    }
    static void more(int[] n){
        int average= totalexpense(n)/n.length;
        System.out.println("average :"+average);
        if(average>500){
            System.out.println("Overspending");
        }
    }
    static void max(int[] n) {
        int max = n[0];
        int index=0;
        int i = 0;
        while (i < n.length) {
            if (max < n[i]) {
                max = n[i];
                index=i;
            }
            i++;
        }
        System.out.println("On day "+(index+1)+" the highest exepse is "+max);
    }
    */
    public static void main(String[] args) {
        //temperatur sensibility checker
       // int[] temp={30, 32, 33, 35};
        int[] temp={30, 32, 31, 34};
        base(temp);
    }
    static void base(int[] n){
        boolean is_stable=true;
        for (int i=0;i<n.length-1;i++) {
            if (n[i] > n[i + 1]) {
                is_stable = false;
            }
        }
           if(is_stable){
               System.out.println("stable");
           }else{
               System.out.println("unstable");
           }
    }

}
