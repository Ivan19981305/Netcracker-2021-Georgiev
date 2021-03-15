public class Main{
    public static void main(String arg[]){
        
        Something object = new Something();
        
               
        /*
        Counter.countNow();
        Counter.countNow();
        */
    }
}


/*консоль:
Ivan@Ivan19981305 MINGW64 /d/repos/Netcracker-2021-Georgiev/15.03.21 (main)
$ javac Main.java

Ivan@Ivan19981305 MINGW64 /d/repos/Netcracker-2021-Georgiev/15.03.21 (main)
$ java Main
static block
Constructor
*/

class Counter{
    static int count = 0;
    public static void countNow(){
        count++;
        System.out.println("now - " + count);
    }
}

class Something{
    static int count = 0;
    
    public Something(){
        System.out.println("Constructor");
    }
    
    static{
        System.out.println("static block");
    }
}
