package OOPS;

import accessModifiers.A;

public class AccessorClass extends A {
    public static void main(String[] args) {
        AccessorClass obj = new AccessorClass();

        // A.num = 24;
        System.out.println(A.num);
        // System.out.println(obj.n);
    }
}
