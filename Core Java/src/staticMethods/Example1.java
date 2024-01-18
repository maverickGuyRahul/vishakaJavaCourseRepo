package staticMethods;

public class Example1 
{
    public static float addTwoNumbers(int a, int b)
    {
        float sum = a + b; // Type Conversion
        // System.out.println("The sum of these numbers is : " + sum);
        return sum;

        // return keyword stops the execution of the method (function).

    } 
    public static void main(String[] args) 
    {
        float catchingVariable = addTwoNumbers(6, 9);
//      int catchingVariable = 15;    (over wrote the line where the function was called)

        System.out.println(catchingVariable);

    }    
}
