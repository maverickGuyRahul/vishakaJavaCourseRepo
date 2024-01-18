package loops.nestedLoop;

public class Example 
{
    public static void main(String[] args) 
    {
        for (int outerVar = 1; outerVar <= 10; outerVar++) 
        {
            System.out.println("Table of " + outerVar);
            System.out.println("\n");

            for (int innerVar = 1; innerVar <= 10; innerVar++) 
            {
                System.out.println(outerVar + " X " + innerVar + " = " + (outerVar * innerVar));
            }
            System.out.println("\n");
        }
    }
}
