package AbstractClasses;

abstract class Cars {

    public abstract void drive();

    public void turnOnAC() {
        System.out.println("Take power supply from APU");
        System.out.println("turn on condenser...");
        System.out.println("turn on fan and spread air everywhere...");
    }

    public abstract void selfDrive();

}

class TeslaModelY extends Cars {

    // Here we have implemented the unimplemented methods of the abstract class.
    public void drive() {
        System.out.println("ignition on");
        System.out.println("gear engaged");
        System.out.println("drive!!");
    }

    public void selfDrive() {
        System.out.println("SWITCH AI FEATURE ON !!");
        System.out.println("ignition on");
        System.out.println("gear engaged");
        System.out.println("drive!!");
    }
}

public class Example {
    public static void main(String[] args) {
        Cars obj = new TeslaModelY();

        obj.selfDrive();
    }
}
