package array.practice;

public class Practice_Arraylevel_1 {
   /* public static void main(String[] args) {
        //Basic mood tracker
        //int [] arr={1,-1,0,1,1,-1};
        //int[] arr={1, 1, 1, 1};
        int[] arr={-1, 0, -1, 0};
       // int[] arr={1, -1};
        base(arr);
    }
    static void base(int [] n){
        int hcount=0;
        int scount=0;
        int ncount=0;
        for (int i = 0; i < n.length; i++) {
                if (n[i] == 1) {
                    hcount += 1;
                } else if (n[i] == -1) {
                    scount += 1;
                } else if (n[i] == 0) {
                    ncount += 1;
                } else {
                    System.out.println("invalid number");
                }
        }
        System.out.println(hcount);
        System.out.println(scount);
        System.out.println(ncount);
        if(hcount>scount&&hcount>ncount){
            System.out.println("happy");
        } else if (scount>ncount&&scount>hcount) {
            System.out.println("sad");
        }else if(ncount>hcount&&ncount>scount){
            System.out.println("neutral");
        }else{
            System.out.println("non dominant");
        }
    }

    */
    public static void main(String[] args) {
        //seat occupancy checker
        int[] arr={1, 1, 1, 1, 1, 1};
        base(arr);
    }
    static void base(int[] n){
        int empty=0;
        int occupied=0;
        for (int i=0 ;i<n.length;i++) {
            if (n[i] == 0) {
                empty++;
            } else if (n[i] == 1) {
                occupied++;
            } else {
                System.out.println("invalid");
            }
        }
            if(n.length==occupied){
                System.out.println("house full");
            }

        System.out.println("occupied seats:"+occupied);
        System.out.println("empty seats:"+empty);
    }
}
