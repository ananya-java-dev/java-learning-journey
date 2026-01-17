package array;

import java.util.Arrays;

public class Array_Day12_Practice2 {
   /* public static void main(String[] args) {
        //Left Rotation by 1
        int[] arr={1, 2, 3, 4};
        for(int i=0;i<arr.length-1;i++) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        //First Missing Positive
        int[] arr={1,2,4,5};
      int missing=arr.length+1;
      int i=0;
      while(i< arr.length){
          if(arr[i]!=i+1){
              missing=i+1;
              break;
              }
          i++;
      }
        System.out.println(missing);
    }
    */
    public static void main(String[] args) {
        //Count Unique Elements
        int[] arr={1, 1, 2, 2, 3};
       int count=1;
        for(int i=1;i<arr.length;i++){
           if(arr[i]!=arr[i-1]) {
             count+=1;
           }
         }
        System.out.println(count);
    }
}
