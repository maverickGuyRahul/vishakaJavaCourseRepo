package ExceptionHandling;

class A {
    public void show() throws ClassNotFoundException {
        Class.forName("ExceptionHandling.ThrowsKeyword");
    }
}

public class ThrowsKeyword {
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (Exception e) {
            System.out.println("Error hai bro...");
        }
    }
}
