package ivge;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] marks = {2, 3, 2, 1};
        Student buggyBoy = new Student("name", 1, 'a', marks);

        Student first = new Student("name", 1, 'a');
        Student second = new Student("name", 1);
        Student third = new Student("name");
    }
}
