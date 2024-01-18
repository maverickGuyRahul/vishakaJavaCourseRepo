package loops;

import java.util.Scanner;

public class ContinueStatement 
{
    public static void main(String[] args) 
    {
        int num = 1;

        while(num < 11)
        {
            if(num == 5)
            {
                num++;
                continue;
            }

            System.out.println(num);
            num++;
        }
    }   
}
