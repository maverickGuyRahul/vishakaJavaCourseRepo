package patternsUsingNestedLoop;

public class InvertedRightAngledTriangle 
{
    public static void main(String[] args) 
    {
        int totalLines = 5;
        int initialSpace = (totalLines * 2) - 2;

        for (int line = 1; line <= totalLines; line++) 
        {
            for (int spaces = initialSpace; spaces > 0; spaces--)
            {
                System.out.print(" ");
            }
            for (int star = 1; star <= line; star++) 
            {
                System.out.print("* ");
            }

            initialSpace = initialSpace - 2;
            System.out.print("\n");

        }
    }
}
