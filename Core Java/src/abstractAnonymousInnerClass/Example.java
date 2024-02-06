package abstractAnonymousInnerClass;

abstract class A {
    public abstract void show();
}

public class Example {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("something changed....");
            }
        };
        obj.show();
    }
}
