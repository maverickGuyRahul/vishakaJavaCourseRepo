package arrays.enhancedForLoop;

public class Example 
{
    public static void main(String[] args) 
    {
        int nums [] = {1,4,7,5,3,8,10};
        
        for (int num : nums) 
        {
            if(num == 5  || num == 10)
            {
                System.out.println(num);
            }
        }

        int number = 10;
        
        do 
        {
            System.out.println("Hello");
        } while (number < 10);
    }
}
