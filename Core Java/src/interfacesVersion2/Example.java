package interfacesVersion2;

interface A {
    int age = 42;
    String area = "New Panvel";

    void show();

    void config();
}

interface X {
    void run();
}

interface Y extends X {

}

class B implements A, Y {

    public void show() {
        System.out.println(A.age + " : " + A.area);
    }

    public void config() {
        System.out.println("some configuration stuff");
    }

    public void run() {
        System.out.println("running.....");
    }

}

public class Example {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        // obj.run();

        Y obj2 = new B();

        obj2.run();
    }
}
