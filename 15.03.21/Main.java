public class Main{
    public static void main(String arg[]){
        Counter.countNow();
        Counter.countNow();
    }
}

class Counter{
    static int count = 0;
    public static void countNow(){
        count++;
        System.out.println("now - " + count);
    }
}


