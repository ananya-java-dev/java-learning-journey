package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Rerevision {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter the elements of n:");
        int n=in.nextInt();
        int[] arr=new int[n];
        base(arr);
    }
    static void base(int[] n){
        System.out.print("enter the elements of array:");
        for(int i=0;i<n.length;i++){
            n[i]=in.nextInt();
        }
        System.out.println("Array:"+Arrays.toString(n));
       /* math(n);
        counter(n);
        find(n);
        check(n);
        System.out.print("enter element you want to find:");
        int target=in.nextInt();
        search(n,target);
        reverse(n);
        */
        secondmax(n);

    }
    static void math(int[] n){
        int max=n[0];
        int min=n[0];
        for(int i=0;i<n.length;i++){
            if(max<n[i]){
                max=n[i];
            }
            if(min>n[i]){
                min=n[i];
            }
        }
        System.out.println("largest element:"+max);
        System.out.println("smallest element:"+min);
    }
    static void counter(int[] n){
        int ecount=0;
        int ocount=0;
        for(int i=0;i<n.length;i++){
            if(n[i]%2==0){
                ecount++;
            }else{
                ocount++;
            }
        }
        System.out.println("total even numbers:"+ecount);
        System.out.println("total odd numbers:"+ocount);
    }
    static void find(int[] n){
        int sum=0;
        for (int i=0;i<n.length;i++){
            sum+=n[i];
        }
        System.out.println("sum of all elements="+sum);
        int average=sum/n.length;
        System.out.println("Average of all elements:"+average);
    }
    static void check(int[] n){
        boolean sort=true;
        for (int i=1;i<n.length;i++){
            if(n[i]<=n[i-1]){
                sort=false;
            }
        }
        if (sort){
            System.out.print("array is in ascending order");
        }else{
            System.out.println("array is not in ascending order");
        }
    }
    static void search(int[] n,int z){
        int store=0;
        for (int i=0;i<n.length;i++){
            if(z==n[i]){
                store=i;
            }
        }
        if(store==0){
            System.out.println("element not found");
        }else{
            System.out.println("element found at index:"+store);
        }
    }
    static void reverse(int[] n){
        for(int i=0;i<n.length/2;i++){
            int temp=n[i];
            n[i]=n[n.length-1-i];
            n[n.length-1-i]=temp;
        }
        System.out.println("reversed array:"+Arrays.toString(n));
    }
    static void secondmax(int[] n){
        int max =Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            if(max<n[i]){
                second=max;
                max=n[i];
            }else{
                if(n[i]>second&&n[i]!=max){
                    second=n[i];
                }
            }
        }
        System.out.println(second);
    }
}
