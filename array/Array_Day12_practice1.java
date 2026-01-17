package array;

public class Array_Day12_practice1 {
   /* public static void main(String[] args) {
        //Mirror Check (Palindrome Array)
        int[] arr={2, 4, 6, 4, 2};
        boolean check=true;
        for (int i = 0;i<arr.length/2; i++){
                if(arr[i]!=arr[arr.length-1-i]){
                    check=false;
                }
        }
        if(check){
            System.out.println("Balanced");
        }else {
            System.out.println("Not Balanced");
        }
    }

    public static void main(String[] args) {
        //Sudden Drop Detector
        int[] arr={10, 12, 15, 14, 16};
        boolean drop=false;
           for(int i=1;i< arr.length;i++){
               if(arr[i]<arr[i-1]) {
                   drop = true;
               }
           }
           if(!drop){
               System.out.println("no drop detected");
           }else{
               System.out.println("Drop detected");
           }
    }
    */
    public static void main(String[] args) {
        //Count Peaks
        int[] arr = {1, 3, 2, 4, 1};
        boolean peak = false;
        int pcount=0;
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                peak = true;
                pcount++;
            }
        }
        System.out.println("total peak:"+pcount);
        if (peak) {
            System.out.println("peak detected");
        } else {
            System.out.println("no peak detected");
        }
    }
}
