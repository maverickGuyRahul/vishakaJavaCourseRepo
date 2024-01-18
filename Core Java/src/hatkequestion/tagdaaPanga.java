package hatkequestion;
import java.util.ArrayList;

public class tagdaaPanga 
{
    public static void main(String[] args) 
    {
        int numbers [] = {7,5,2,2,8,8,7,2,2,5};
        int counter = 1;
        boolean isRepeated = false;
        ArrayList <Integer> repeatedNums = new ArrayList<>();
        // System.out.println("HELLO PILLAI CHI PUBLIC");
        int indexOfNum = 0;
        boolean uniqueElementInArraylist = true;

        for (int num : numbers) 
        {
            for (int i = (indexOfNum+1); i < numbers.length; i++) 
            {
                if(num == numbers[i])
                {
                    counter++;
                    // System.out.println(num + " found a match.");
                }
                if(counter > 1)
                {
                    isRepeated = true;
                }

                if(isRepeated)
                {
                    for (int numOfArraylist : repeatedNums) 
                    {
                        if(num == numOfArraylist)
                        {
                            uniqueElementInArraylist = false;
                            break;
                        }
                        else
                        {
                            uniqueElementInArraylist = true;
                        }
                    }
                    if(uniqueElementInArraylist == true)
                    {
                        repeatedNums.add(num);
                    }
                    
                    
                }
            }
            indexOfNum++;
        }

        System.out.println(repeatedNums);
    }
}
