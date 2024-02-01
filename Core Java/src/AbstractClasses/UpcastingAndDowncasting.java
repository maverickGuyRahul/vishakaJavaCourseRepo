package AbstractClasses;

class A {
    public void showA() {
        System.out.println("This is inside Class A");
    }
}

class B extends A {

    public void showB() {
        System.out.println("This is inside Class B");
    }
}

public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        A obj = (A) new B(); // UPCASTING - Fitting things of higher capacity into variables of lesser
                             // capacity.
        // obj.showB();

        double D = 27.67;
        int num = (int) D;

        B obj2 = (B) obj;
        obj2.showB();
    }
}
