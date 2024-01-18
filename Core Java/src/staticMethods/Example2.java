package staticMethods;

public class Example2 
{
    public static int addTwoNumbers(float a, float b)
    {
        int sum = (int) (a + b);
        return sum;

    } 
    public static void main(String[] args) 
    {
        int catchingVariable = addTwoNumbers(6.2f, 9.5f);

        System.out.println(catchingVariable);

    }    
}
