package systemOutPrintln;

import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        // System.out.println();
        int number = 0;
        try {
            System.out.println("Please enter a number");
            number = System.in.read();
            int result = number / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(number);

    }
}
