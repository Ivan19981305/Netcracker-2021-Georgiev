package ivge;

import static ivge.calculator.Calculator.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(sum(3, 4));
        System.out.println(difference(3, 4));
        System.out.println(production(3, 4));


        System.out.println(division(3.0, 4.0));
        System.out.println(division(3.0, 0.0));
        System.out.println(division(0.0, 0.0));
        System.out.println(division(3, 0));
    }
}

/*
answers:
7
-1
12
0.75
Infinity
NaN
a = 3/ by zero
2147483647
 */