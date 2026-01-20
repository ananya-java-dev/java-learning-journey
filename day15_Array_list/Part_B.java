package day15_Array_list;

import java.util.ArrayList;

public class Part_B {
    public static void main(String[] args) {
        //QUESTION 1 — Array ➜ ArrayList Conversion
        int[] arr = {10, 20, 30, 40, 50};
        ArrayList<Integer> arr1=new ArrayList<>(5);
        int size= arr.length;
        for(int i=0;i<size;i++){
            arr1.add(arr[i]);
        }
        System.out.println("initial array:"+arr1);
        //QUESTION 2 — Sum of Elements (ArrayList)
        int sum=0;
        for(int k=0;k<size;k++){
            sum+= arr1.get(k);
        }
        System.out.println("sum of all elements:"+sum);
        //QUESTION 3 — Find Maximum Element
        int max= arr1.getFirst();
        for(int j=1;j<size;j++){
            if(max<arr1.get(j)){
                max= arr1.get(j);
            }
        }
        System.out.println("maximum element:"+max);
        //QUESTION 4 — Remove Elements Below a Value
        //Tasks:
        //Remove all elements less than 30
        //Print the updated ArrayLis
        //way1:index based removal
      /*  int r=0;
        while(r<3){
            arr1.remove(0);
            r++;
        }
        System.out.println(arr1);
        //way2:value based removal
        arr1.removeIf(x->x<30);
        System.out.println(arr1);
       */
        //QUESTION 5 — Count Even Numbers
        int count=0;
        for (int e=0;e<size;e++){
            if(arr1.get(e)%2==0){
                count++;
            }
        }
        System.out.println("even numbers:"+count);
        //QUESTION 6 — Update Elements
        for (int u=0;u<size;u++){
            arr1.set(u,arr1.get(u)*2);
        }
        System.out.println("Updated array:"+arr1);
        arr1.removeIf(x->x<30);
        System.out.println("array after deletion of element below size 30:"+arr1);
    }
}
