package Day_13;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr={64, 25, 12, 22, 11};
        sort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void sort(int[] n){
        for(int i=0;i<n.length;i++){
            int max=n[0];
            int index=0;
            for(int j=0;j<n.length-i;j++) {
                if (max < n[j]) {
                    max = n[j];
                    index = j;
                }
            }
            // swaping
                int temp=n[index];
                n[index]=n[n.length-i-1];
                n[n.length-i-1]=temp;

        }
    }
}
