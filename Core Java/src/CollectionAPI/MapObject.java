package CollectionAPI;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapObject {
    public static void main(String[] args) {
        Map<String, Integer> students = new TreeMap<String, Integer>();

        students.put("masala dosa", 70);
        students.put("Rahul", 57);
        students.put("Harsh", 55);
        students.put("Sneha", 23);
        students.put("Rahul", 21);
        System.out.println(students);
        System.out.println(students.get("Rahul"));

        System.out.println(students.keySet());
        System.out.println(" ");
        System.out.println(" ");
        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}