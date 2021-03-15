public class Task4
{
    public static void main(String arg[])
    {
        Integer integerByAutoboxing_1 = 1;
        Integer integerByAutoboxing_2 = 1;
        
        
        System.out.println("ByAutoboxing " + (integerByAutoboxing_1 == integerByAutoboxing_2));
        
        
        Integer integerByConstructor_1 = new Integer(1);
        Integer integerByConstructor_2 = new Integer(1);
        
        
        System.out.println("ByConstructor " + (integerByConstructor_1 == integerByConstructor_2));
    }
}

/*
Ivan@Ivan19981305 MINGW64 /d/repos/Netcracker-2021-Georgiev/15.03.21 (main)
$ java Task4
ByAutoboxing true
ByConstructor false
*/
