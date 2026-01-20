package day15_Array_list;

import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
     /*   What to learn (in this order)
        What is ArrayList
        How it differs from arrays
        Core operations:
        1.add()
        2.get()
        3.set()
        4.remove()
        5.size()
        Looping through an ArrayList (for, for-each)
      */
        ArrayList<Integer> list=new ArrayList<>();
        // array={6,12,18,24,30,36}
        list.add(6);
        list.add(12);
        list.add(18);
        list.add(24);
        list.add(30);
        list.add(36);
        System.out.println("1.Array:"+list);
        System.out.println("2.the element at index 2 is:"+list.get(2));
         list.set(0,8);
        System.out.println("3.the modified array:"+list);
        list.remove(0);
        System.out.println("4.after 0th element removal list:"+list);
        int z=list.size();
        System.out.println("5.size of array:"+z);
        System.out.print("final array:");
        for(int i=0;i<z;i++){
            System.out.print(list.get(i)+",");
        }

    }
}
