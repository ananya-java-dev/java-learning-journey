package array;

public class Day11_Practice2 {
   static class books{
        String title;
        int price;
   }
    public static void main(String[] args) {
        //library book tracker
        books[] arr=new books[4];//crete only refrence it like telling something is gonna happen
        arr[0] = new books();//here we are actually making object that it is happening
        arr[1] = new books();
        arr[2] = new books();
        arr[3] = new books();
        arr[0].title="The midnight library";
        arr[0].price=119;
        arr[1].title="the secret";
        arr[1].price=123;
        arr[2].title="ikigai";
        arr[2].price=169;
        arr[3].title="HC VERMA";
        arr[3].price=150;
        System.out.println("--library book tracker--");
        for(int i=0;i<arr.length;i++){
          System.out.println(""+(i+1)+".Title:"+arr[i].title+",Price:"+arr[i].price);
        }
        // to find most expensive book
       more(arr);
        averagee(arr);
    }
    static void more(books[] a){
        int expensive=a[0].price;
        String title=a[0].title;
        for(int i=0;i< a.length;i++){
            if(expensive<a[i].price ){
                expensive=a[i].price;
                title=a[i].title;
            }
        }
        if(expensive==a[0].price) {
            System.out.println("the most expensive book is:"+a[0].title+",price:"+expensive);
        }else{
            System.out.println("the most expensive book is:"+title+",price"+expensive);
        }

    }
    static void averagee(books[] b){
       int sum=0;
       for(int i=0;i<b.length;i++){
           sum+=b[i].price;
       }
       int average=sum/ b.length;
        System.out.println("Average price:"+average);
        if(average>0&&average<300){
            System.out.println("Budget friendly collection");
        }else {
            System.out.println("Expensive collection");
        }
    }

}
