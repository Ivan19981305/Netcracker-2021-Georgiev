package ivge;

public class Planet {
    private static boolean was = false;

    public Planet() {
        if (was)
            throw new ArithmeticException("Something wrong");
        else
            was = true;
    }
}
