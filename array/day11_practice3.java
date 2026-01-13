package array;

import java.util.Arrays;
import java.util.Scanner;

//2D matrix
public class day11_practice3 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Classroom Seating Matrix
       int[][] arr2D=new int[2][4];
        System.out.print("enter elements of matrix:");
       for(int row=0;row< arr2D.length;row++){
           for (int col=0;col<arr2D[row].length;col++){
               arr2D[row][col]=in.nextInt();
           }
       }
       //for output
       for (int row=0;row< arr2D.length;row++){
               System.out.println(Arrays.toString(arr2D[row]));
       }
       counter(arr2D);
    }
    static void counter(int[][] a){
        int ocount=0;
        int ecount=0;
        for(int row=0;row< a.length;row++){
            for (int col=0;col<a[row].length;col++){
               if(a[row][col]>=1){
                   ocount+=1;
               }else if(a[row][col]==0){
                   ecount+=1;
               }
            }
        }

        System.out.println("total occupied seat:"+ocount);
        System.out.println("total empty seat:"+ecount);
        if(ecount==0){
            System.out.println("classroom full");
        }
    }

}
