package patternsUsingNestedLoop;

/* 
  Expected Output :

  *                         
  * *
  * * *
  * * * *
  * * * * *

*/





public class RightAngledTriangle 
{
    public static void main(String[] args) 
    {
        for (int line = 1; line <= 5; line++) 
        {
            for (int stars = 1; stars <= line; stars++) 
            {
                System.out.print(stars + " ");
            }
            System.out.print("\n");
        }
    }    
}
