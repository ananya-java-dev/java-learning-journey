package Searching_Sorting;

public class day17_More_programs {
    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,3,3};
        int target=5;
        int ans_first=firstocurence(arr,target);
        System.out.println(ans_first);
       int ans_last= lastocurence(arr,target);
        System.out.println(ans_last);
      //  Count Occurrences
        int s=counter(ans_first,ans_last);
        System.out.println(s);
    }
    static int counter(int n,int m){
        if(m==-1&&n==-1){
            return 0;
        }
        int ans =m-n+1;
       return ans;
    }

    static int firstocurence(int[] arr,int target){
       int ans=-1;
       int start=0;
       int end=arr.length-1;
       boolean is_first=true;
       while(start<=end){
           int mid=start+(end-start)/2;
           if(target==arr[mid]){
               ans=mid;
               if(is_first){
                   if(target>=arr[mid]){
                       end=mid-1;
                   }else{
                       start=mid+1;
                   }
               }
           }else if(target>arr[mid]){
               start=mid+1;
           }else{
               end=mid-1;
           }
       }
       return ans;
    }
    static int lastocurence(int[] arr,int target){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        boolean is_last=true;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                ans=mid;
                if(is_last){
                    if(target>=arr[mid]){
                        start=mid+1  ;
                    }else{
                        end=mid-1;
                    }
                }
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
}
