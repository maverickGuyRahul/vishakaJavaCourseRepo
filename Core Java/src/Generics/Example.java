package Generics;

import java.util.ArrayList;

class A<DType> {
    public DType variable;

    public A(DType number) {
        this.variable = number;
        System.out.println("The value of the variable is : " + this.variable);
    }
}

public class Example {
    public static void main(String[] args) {
        A<String> obj = new A<String>("Rahul");
        A<Integer> obj2 = new A<Integer>(24);
    }
}
