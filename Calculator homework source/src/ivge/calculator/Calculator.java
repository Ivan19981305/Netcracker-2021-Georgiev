package ivge.calculator;

public class Calculator
{
    public static int sum(int a, int b)
    {
        return a + b;
    }
    public static double sum(double a, double b)
    {
        return a + b;
    }

    public static int difference(int a, int b)
    {
        return a - b;
    }
    public static double difference(double a, double b)
    {
        return a - b;
    }

    public static int production(int a, int b)
    {
        return a * b;
    }
    public static double production(double a, double b)
    {
        return a * b;
    }

    public static int division(int a, int b)
    {
        return divisionInternal(a, b);
    }
    public static double division(double a, double b)
    {
        return a / b;
    }

    private static int divisionInternal(int a, int b)
    {
        try {
            return a / b;
        } catch (ArithmeticException ex)
        {
            System.out.println("a = "+ a + ex.getMessage());
            return Integer.MAX_VALUE;
        }

    }

}
