package Inheritance;

class Phone {
    int phoneNumber;

    public void call(long dialNumber) {
        System.out.println("Calling " + dialNumber + "......");
    }

    public Phone() {
        System.out.println("Constructor of PARENT");
    }
}

class SmartPhone extends Phone {

    public void call(long dialNumber) {
        System.out.println("Calling " + dialNumber + " via VoLTE");
    }

    // public Phone() {
    // System.out.println("Constructor of PARENT");
    // }

    public SmartPhone() {
        super(); // This thing is already present in all the constructors of child classes which
                 // is hiddent, actually.
        System.out.println("Constructor of CHILD");
    }

}

public class Example1 {
    public static void main(String[] args) {
        // Phone obj = new SmartPhone();
        // // Dynamic Method Dispatch : The object of child can reside in the reference
        // of
        // // parent, but the opposite cannot happen And this thing is known as dynamic
        // // method dispatch.
        // obj.call(8356982412L);

        // Phone obj2 = new Phone();
        // obj2.call(8356982412L);
        SmartPhone obj = new SmartPhone();

    }

}
