package arrays.primeNumberProgram;
import java.util.Scanner;

public class PrimeNumberProgram 
{
    public static void main(String[] args) 
    {
        int nums[] = new int[5];
        Scanner sc = new Scanner(System.in);
        boolean primeStatus = false;

        for (int index = 0; index < nums.length; index++) 
        {
            System.out.print("Please enter value of element " + (index+1) + " : ");
            nums[index] = sc.nextInt();
            System.out.print("\n");
        }

        System.out.println("The elements inside the array are : ");

        for (int index = 0; index < nums.length; index++) 
        {
            if(index <= (nums.length - 2))
            {
                System.out.print(" | " + nums[index]);
            }
            else
            {
                System.out.print(" | " + nums[index] + " | ");
                System.out.print("\n");
                System.out.println("\n");
            }
        }

        // PRIME NUMBER CHECKING LOGIC BEGINS HERE : 

        int pickedNumber;

        for (int index = 0; index < nums.length; index++) 
        {
            pickedNumber = nums[index];

            if (pickedNumber == 1)
            {
                System.out.println(pickedNumber + " is neither prime nor composite");
            }
            else if (pickedNumber == 2)
            {
                System.out.println(pickedNumber + " is a Prime number ");
            }
            else if (pickedNumber > 2)
            {
                for (int checker = 2; checker < pickedNumber; checker++) 
                {
                    if((pickedNumber % checker) == 0)
                    {
                        primeStatus = false;
                        break;
                    }
                    else
                    {
                        primeStatus = true;
                    }
                }

                if (primeStatus == true) 
                {
                    System.out.println(pickedNumber + " is a PRIME NUMBER");
                }
                else
                {
                    System.out.println(pickedNumber + " is NOT A PRIME NUMBER");
                }
            }
            
            
        }
    }    
}
