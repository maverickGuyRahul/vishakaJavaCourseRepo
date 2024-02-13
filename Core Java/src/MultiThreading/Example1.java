package MultiThreading;

import accessModifiers.A;
import accessModifiers.B;

class Z {

}

// class A implements Runnable {
// public void run() {
// for (int i = 1; i < 101; i++) {
// System.out.println("Hi");
// // try {
// // Thread.sleep(200);
// // } catch (InterruptedException e) {
// // e.printStackTrace();
// // }
// }
// }
// }

// class B implements Runnable {
// public void run() {
// for (int i = 1; i < 101; i++) {
// System.out.println("Hello");
// }
// // try {
// // Thread.sleep(200);
// // } catch (InterruptedException e) {
// // e.printStackTrace();
// // }
// }
// }

class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class Example1 {
    public static void main(String[] args) {
        // Runnable obj1 = new A();
        // Runnable obj2 = new B();
        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();

        // try {
        // Thread.sleep(2000);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }

        t2.start();

        // obj1.setPriority(Thread.MAX_PRIORITY);
        // System.out.println("obj1 : " + obj1.getPriority());
        // System.out.println("obj2 : " + obj2.getPriority());

        // try {
        // Thread.sleep(300);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(c.count);
    }

}
