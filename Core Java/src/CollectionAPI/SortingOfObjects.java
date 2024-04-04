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
        ArrayList<Students> details = new ArrayList<Students>();

        details.add(new Students(42, "Rahul"));
        details.add(new Students(26, "Vishaka"));
        details.add(new Students(36, "Sneha"));
        details.add(new Students(5, "Vivaan"));

        Comparator<Students> com = (i, j) -> {
            // if (i.age > j.age) {
            // return 1;
            // } else {
            // return -1;
            // }

            return (i.age > j.age) ? 1 : -1;
        };

        Collections.sort(details, com);
        // Collections.sort(details);

        System.out.println(details);

    }
}
