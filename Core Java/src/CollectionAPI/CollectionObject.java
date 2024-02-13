package CollectionAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionObject {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(6);
        // nums.add("Rahul");

        for (Integer number : nums) {
            int num = (Integer) number;
            System.out.println(num * 2);
        }
    }
}