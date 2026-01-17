package Searching_Sorting;

public class Binary_search {
    public static void main(String[] args) {
        // int[] arr={-18,-12,-6,0,1,6,12,18,24,30,36};
        //   int[] arr={5};
        int[] arr={-1,0,3,5,9,12};
        int target=0;
        int ans= binary_search(arr,target);
        System.out.println("index:"+ans);
    }
    static int binary_search(int[] n,int target){
        int start=0;
        int end=n.length-1;
        while(start<=end) {
            int mid =start+(end-start)/2;
            if (target == n[mid]) {
                return mid;
            } else if (target > n[mid]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}
