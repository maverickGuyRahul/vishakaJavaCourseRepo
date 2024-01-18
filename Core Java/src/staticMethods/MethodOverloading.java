package staticMethods;

public class MethodOverloading 
{
    public static int add(int a, int b)
    {
        int sum = a + b;
        return sum;
    }

    public static int add(float a, int b)
    {
        int sum = (int) (a + b);
        return sum;
    }

    public static void main(String[] args) 
    {
        int catchingVariable = add(6.2f, 9);

    }
}
