package Day_13;

public class Linear_Search {
    public static void main(String[] args) {
        /*//Q1. Basic Search
        //Input: {5, 3, 7, 1, 9}
        //Target: 7
        //Output: index of 7 or -1 if not found
        int[] arr={5,3,7,1,9};
        int target=7;
        int s=search(arr,target);
        System.out.println(s);
        //Q2. First Occurrence
        //Input: {2, 4, 4, 4, 6}
        //Target: 4
        //Output: index of first 4
        int[] arr = {2, 4, 4, 4, 6, };
        int target = 4;
        int s = occurence(arr, target);
        System.out.println(s);
         */
        //Count Occurrences
        //Input: {1, 2, 2, 2, 3}
        //Target: 2
        //Output: count = 3
        int[] arr={1,2,2,2,3};
        int target=2;
        int ans=counter(arr,target);
        System.out.println(ans);

    }

    static int search(int[] n, int target) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int occurence(int[] n, int target) {
        int index = n.length - 1;
        int initial = n[0];
        //to check about an element occurence
        for (int i = 0; i < n.length - 1; i++) {
            if (target == n[i]) {
                return i;
            }
        }
        return -1;
    }
    static int counter(int[] n,int target){
        int i=0;
        int count=0;
        while(i<n.length){
            if(target==n[i]){
                count++;
            }
            i++;
        }
        return count;
    }
}
