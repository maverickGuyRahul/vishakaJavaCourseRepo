package arrays.primeNumberProgram;

public class PrimeNosBetwn1To100 
{
    public static void main(String[] args) 
    {
        boolean primeStatus = false;

        for (int num = 1; num <= 100; num++) 
        {
            if (num == 1)
            {
                System.out.println(num + " is neither prime nor composite");
            } 
            else if (num == 2) 
            {
                System.out.println(num + " is a Prime number ");
                System.out.println(" The remaining prime numbers are : ");
            } 

            else if (num > 2) 
            {
                for (int checker = 2; checker < num; checker++) 
                {
                    if ((num % checker) == 0) 
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
                    System.out.print(num + ", ");
                }
            }
        }
    }    
}
