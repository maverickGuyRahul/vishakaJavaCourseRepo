package Inheritance;

class A {
    public A() {
        System.out.println("constructor of A");
    }

    public A(int num) {
        this();
        System.out.println("parameterized constructor of A : " + num);
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("constructor of B");
    }

    public B(int num) {
        this(); // this() method over writes the already existing super() method.
        System.out.println("parameterized constructor of B : " + num);
    }
}

public class constructorOverloading {
    public static void main(String[] args) {
        B obj = new B(55);
    }
}
