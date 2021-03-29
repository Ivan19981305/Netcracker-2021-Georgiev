package ivge;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Something<Integer, SerializableAnimal, Double> something = new Something( 15, new SerializableAnimal(), 54.2);


        System.out.println(something.getFirst());
        System.out.println(something.getSecond());
        System.out.println(something.getThird());

        something.getClassNames();
    }
}