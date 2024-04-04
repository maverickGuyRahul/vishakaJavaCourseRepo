package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SolvingArrayIssue {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 9, 6, 1, 5, 10, 12, 54, 27, 33);

        // int sum = 0;
        // for (Integer number : nums) {
        // if (number % 2 == 0) {
        // number *= 2;
        // sum = sum + number;
        // }
        // }

        // System.out.println(sum);

        // System.out.println(nums);
        // Consumer<Integer> com = (i) -> {
        // System.out.println(i);
        // };

        nums.forEach(number -> System.out.println(number));
    }

}
