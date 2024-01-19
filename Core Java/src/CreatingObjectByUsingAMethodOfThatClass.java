class A {

    public static A createObject() {
        return (new A());
    }

    public A() {
        System.out.println("An object has been created!!!");
    }

}

public class CreatingObjectByUsingAMethodOfThatClass {
    public static void main(String[] args) {
        // A obj = new A();

        A implicitObject = A.createObject();
        // A implicitObject = new A();
    }

}
