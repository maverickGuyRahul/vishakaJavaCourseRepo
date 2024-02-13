package CollectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students {
    int age;
    String name;

    @Override
    public String toString() {
        return name + " : " + age;
    }

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

}

public class SortingOfObjects {
    public static void main(String[] args) {
        List<Students> nums = new ArrayList<>();

        nums.add(new Students(42, "Rahul"));
        nums.add(new Students(26, "Vishaka"));
        nums.add(new Students(26, "Sneha"));
        nums.add(new Students(5, "Vivaan"));

        Comparator<Students> com = (i, j) -> {
            if (i.age > j.age) {
                return 1;
            } else {
                return -1;
            }
        };

        Collections.sort(nums, com);

        System.out.println(nums);

    }
}
