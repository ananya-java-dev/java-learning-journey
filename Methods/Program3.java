package Methods;

public class Program3 {
    // function overloading
    public static void main(String[] args) {
       sum(4.098,6.768);
       sum(7,9,8);
       sum(6,5);
    }
    static void sum(int a,int b){
        int sum=a+b;
        System.out.println("sum="+sum);
    }
    static void sum(double a,double b){
        double sum =a+b;
        System.out.println("sum="+sum);
    }
    static void sum(int a,int b,int c){
        int sum=a+b+c;
        System.out.println("sum="+sum);
    }

}
