package CollectionAPI;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();

        numbers.add(23);
        numbers.add(21);
        numbers.add(12);
        numbers.add(06);

        System.out.println("Queue : " + numbers);

        Integer removedElement = numbers.remove();
        System.out.println("Removed element : " + removedElement);
        System.out.println("Queue : " + numbers);

        numbers.add(51);
        System.out.println("inserted element...");
        System.out.println("Queue : " + numbers);
    }
}
