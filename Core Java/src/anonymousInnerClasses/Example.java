package anonymousInnerClasses;

class A {
    public void show() {
        System.out.println("something....");
    }
}

// class B extends A {
// public void show() {
// System.out.println("something changed....");
// }
// }

public class Example {
    public static void main(String[] args) {
        // Here it seems like the Object that is getting created is of class 'A'. But in
        // reality,
        // that object which is being created is of the anonymous inner class, which is
        // also the child class of A.
        A obj = new A() {
            public void show() {
                System.out.println("something changed....");
            }

            // public void show2() {
            // System.out.println("show2 () is running....");
            // }
        };
        obj.show();
        // obj.show2();
    }
}
