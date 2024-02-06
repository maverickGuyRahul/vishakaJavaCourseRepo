package Annotations;

@Deprecated
class A {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("inside A...");
    }
}

class B extends A {

    @Override
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("inside B...");
    }
}

public class Example {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();

        Integer num = new Integer(25);
    }
}
