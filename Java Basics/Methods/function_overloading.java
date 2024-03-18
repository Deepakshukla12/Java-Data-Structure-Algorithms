package Methods;

public class function_overloading {
    public static void main(String[] args) {
        System.err.println(sum(3,5));
        System.out.println(sum(3,4,1));
    }

    // sum of 2 numbers(indicated by number of parameters)
    private static int sum(int a, int b)
    {
        return a+b;
    }

    // sum of 3 numbers(indicated by number of parameters)
    private static int sum(int a, int b, int c)
    {
        return a+b+c;
    }
}
