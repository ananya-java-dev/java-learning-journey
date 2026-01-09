package array;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {
        System.out.println("Basic array declaration & printing");
        int[] numbers={23,56,76,87,53,86};
        for (int i= 0;i<numbers.length;i++){
            System.out.print(numbers[i]+",");
         //   System.out.println(Arrays.toString(numbers));
        }
    }
}
