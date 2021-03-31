package ivge;

public class OuterClass {
    public OuterClass() {
        System.out.println("OuterClass was created");
    }

    public class InnerClass{
        public InnerClass() {
            System.out.println("InnerClass was created");
        }
    }

    public static class NestedClass{
        public NestedClass() {
            System.out.println("NestedClass was created");
        }
    }
}
