package array;

public class Array_Day11Practice1 {
    public static void main(String[] args) {
        //Q.student performance register

      String[] name=new String[3];
      name[0]="ananya";
      name[1]="pawni";
      name[2]="nisarga";
      int[] marks= new int[3];
      marks[0]=87;
      marks[1]=16;
      marks[2]=35;
        System.out.println("---Student Details--");
      for(int i=0;i<3;i++){
          System.out.println("Name:"+name[i]+",Marks:"+marks[i]);
      }
      //counting student who scored above 60
        System.out.println("student who scored above 60 :"+counter(marks));
       fail(marks,name);
    }
    static int counter(int[] n){
       int count=0;
       int j=0;
       while(j<3){
           if(n[j]>60){
               count++;
           }
           j++;
       }
      return count;
    }
    static void fail(int[] n,String[] a){
       boolean fail=false;//this is making a flag in code
        int j =0;
        while(j<n.length){
            if(n[j]<40){
                System.out.println("student who failed:"+a[j]+" and their marks :"+n[j]);
                fail=true;
            }
            j++;
        }
        if(!fail){
            System.out.println("no student failed any subject");
        }
    }

}
