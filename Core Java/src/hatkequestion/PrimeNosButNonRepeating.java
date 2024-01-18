package hatkequestion;

import java.util.ArrayList;

public class PrimeNosButNonRepeating 
{
    public static boolean isPrime(int pickedNumber)
    {
        boolean primeStatus = false;
        if (pickedNumber == 1) 
        {
            primeStatus = false;
            return primeStatus;
        } 
        else if (pickedNumber == 2) 
        {
            primeStatus = true;
            return primeStatus;
        } 
        else if (pickedNumber > 2) 
        {
            for (int checker = 2; checker < pickedNumber; checker++) 
            {
                if ((pickedNumber % checker) == 0) 
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
                    return primeStatus;
                }
            
        }
        return primeStatus;
    }


    public static boolean isRepeated(int number, ArrayList <Integer> theArraylist)
    {
        boolean repeatStatus = false;
        int counter = 1;
        for (Integer num : theArraylist) 
        {
            if(number == num)
            {
                repeatStatus = true;
                break;
            }
            else
            {
                repeatStatus = false;
            }
        }

        if(repeatStatus)
        {
            return repeatStatus;
        }
        return repeatStatus;
    }
    public static void main(String[] args) 
    {
        boolean primeStatus;
        // System.out.println(primeStatus);

        int numbers[] = {2,7,5,6,5,2,8,7,9,11};
        int counter = 1;
        boolean isRepeated;
        ArrayList <Integer> nonRepeatedPrimeNumbers = new ArrayList<>();

        for (int num : numbers) 
        {
            primeStatus = isPrime(num);
            if(primeStatus == true)
            {
                isRepeated = isRepeated(num, nonRepeatedPrimeNumbers);
                    if(!isRepeated)
                    {
                        nonRepeatedPrimeNumbers.add(num);
                    }
            }
        }

        System.out.println(nonRepeatedPrimeNumbers);
    }
}
