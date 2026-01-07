package Methods;

public class Program2 {
    public static void main(String[] args) {
        //method with parameters
        sum(7,8);
        // method with return value
        int x=8;
        int y=9;
        basic(x,y);

    }
    static void sum(int a,int b){
        int add=a+b;
        System.out.println("sum="+add);
    }
    static int basic(int a,int b){
        int add = a+b;
        System.out.print("sum="+add);
        return add;
    }
}
