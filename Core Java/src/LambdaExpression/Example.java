package LambdaExpression;

import accessModifiers.B;

@FunctionalInterface
interface A {
    // void add(int num);
    int add(int num1, int num2);
}

// class B implements A {
// public void add() {
// System.out.println("This Method adds something......");
// }
// }

public class Example {
    public static void main(String[] args) {
        // A obj = num -> System.out.println("num : " + num);

        // obj.add(24);

        // A obj = (num1, num2) -> num1 + num2; // This line says that this particular
        // method is going to take two
        // // parameters, namely, num1 and num2. And it is going to return the
        // // addition of both those parameters.

        // System.out.println("addition is : " + obj.add(24, 21));

        A obj = (num1, num2) -> {
            System.out.println("num1 : " + num1);
            System.out.println("num2 : " + num2);
            return num1 + num2;
        };

        System.out.println("addition is : " + obj.add(24, 21));
    }
}
