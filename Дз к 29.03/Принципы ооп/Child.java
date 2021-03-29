package ivge;

public interface Child extends Parent{
    private static void encapsulatedMethod() {
        System.out.println("Something encapsulated");
    }

    @Override
    default public void anotherMethod(){
        System.out.println("Something completely different");
    }

    public static void thirdMethod()
    {
        encapsulatedMethod();
    }
}
