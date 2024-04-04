package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamPartOne {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 9, 6, 1, 5, 10, 12, 54, 27, 33);

        // Predicate<Integer> pred = (number) -> {
        // return number % 2 == 0;
        // };

        // Integer sumValue = s3.reduce(0, (c, e) -> {
        // System.out.println("c : " + c);
        // System.out.println("e : " + e);
        // return c + e;
        // });

        Integer sumValue = nums.stream()
                               .filter(number -> number % 2 == 0)
                               .map(number -> number * 2)
                               .reduce(0, (additionVal, streamNextVal) -> additionVal + streamNextVal);

        System.out.println("SUM : " + sumValue);

        // s1.forEach(number -> System.out.println(number));

        // s1.forEach(number -> System.out.println(number));
    }

}
