package InnerClasses;

class A {
    static int age = 42;

    class B {
        public void showInsideB() {
            System.out.println("Data inside B which is inside A");
        }
    }

    public void show() {
        System.out.println("Data inside show method of A");
    }
}

public class StaticAndInstanceInnerClasses {
    public static void main(String[] args) {
        System.out.println(A.age);
        A obj = new A();
        obj.show();

        /* When the inner class is 'static' */
        // A.B objB = new A.B();
        // objB.showInsideB();

        /* When the inner class is 'instance inner class' */
        // A.B refOfB = obj.new B();
        // refOfB.showInsideB();
    }

}
