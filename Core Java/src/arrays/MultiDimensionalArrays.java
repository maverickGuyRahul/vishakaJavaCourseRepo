package arrays;

public class MultiDimensionalArrays 
{
    public static void main(String[] args) 
    {
        // int nums [] [] = new int [3][3];

        int nums[][] = new int[3][];
        nums[0] = new int [4];
        nums[1] = new int [2];
        nums[2] = new int[3];

        System.out.println(nums[0].length);
        
        for (int outerIndex = 0; outerIndex < nums.length; outerIndex++) 
        {
            for (int innerIndex = 0; innerIndex < nums[outerIndex].length; innerIndex++) 
            {
                
            }
        }
    }    
}
