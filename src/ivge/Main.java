package ivge;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> listString = new ArrayList<>();
        List<Cat> listCat = new ArrayList<>();
        List<Integer> listInteger = new ArrayList<>();

        System.out.println(listCat.getClass() == listInteger.getClass());
    }
}