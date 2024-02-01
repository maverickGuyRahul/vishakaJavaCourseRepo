package accessModifiers;

public class A {
    public static final int num = 12;

    int n = 24;

    public static void main(String[] args) {
        A obj = new A();

        System.out.println(obj.n);
    }
}
