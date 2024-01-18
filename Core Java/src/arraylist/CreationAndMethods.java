package arraylist;
import java.util.ArrayList;

public class CreationAndMethods
{
    public static void main(String[] args) 
    {
        ArrayList <Integer> nums = new ArrayList <>();

        nums.add(12);
        nums.add(15);
        nums.add(21);
        nums.add(35);
        nums.add(1, 30);
        nums.set(1, 54);

        boolean result = nums.add(3);
        System.out.println(result);

        for (int index = 0; index < nums.size(); index++) 
        {
            System.out.print(nums.get(index) + " | ");
        }

        int removedElement = nums.remove(2);

        // nums.remove(15);

        System.out.println("This element was removed : " + removedElement);

        System.out.println(nums.size());

        // for (Integer number : nums) 
        // {
        //     System.out.print(number + " | ");
        // }
    }
}