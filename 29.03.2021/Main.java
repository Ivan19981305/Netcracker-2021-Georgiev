package ivge;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Something<Integer, String, Double> something = new Something<>(5, "12", 4.2);
        System.out.println(something.getFirst());
        System.out.println(something.getSecond());
        System.out.println(something.getThird());

        something.getClassNames();
    }
}