package CollectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorVSComparable {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(24);
        nums.add(21);
        nums.add(63);
        nums.add(18);

        Comparator<Integer> com = new Comparator<>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Collections.sort(nums, com);

        System.out.println(nums);

    }
}
