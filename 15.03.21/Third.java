public class Third
{
    public static void main(String arg[])
    {
        
        Integer integerByConstructor_1 = new Integer(1);
        Integer integerByConstructor_2 = new Integer(2);
        
        Integer integerByAutoboxing_1 = 1;
        Integer integerByAutoboxing_2 = 2;
        
        if (integerByConstructor_1 > integerByConstructor_2)
        {
            System.out.println("integerByConstructor_1\n");
        }
        else
        {
            System.out.println("integerByConstructor_2\n");
        }
        
        System.out.println("Sum " + (integerByAutoboxing_1 + integerByAutoboxing_2));
    }
}


