package CollectionAPI;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> nums = new TreeSet<>();

        nums.add("rahul");
        nums.add("sneha");
        nums.add("ankush");
        nums.add("vishaka");

        for (String number : nums) {
            System.out.println(number);
        }
    }
}
