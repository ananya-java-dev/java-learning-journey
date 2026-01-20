package Day_13;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr={5, 1, 4, 2, 8};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] n){
        boolean swaped;
        for(int j=0;j<n.length;j++) {
               swaped=false;
            for (int i = 1; i < n.length-j; i++) {
                if (n[i] < n[i - 1]) {
                    int temp = n[i];
                    n[i] = n[i - 1];
                    n[i - 1] = temp;
                    swaped=true;
                }
            }
            if(!swaped){
                break;
            }
        }

    }
}
