package InterfaceDemo;

// @FunctionalInterface
// interface I {
//     public void abc();
// }

// class A implements I {
//     public void abc() {
//         System.out.println("this is from A");
//     }
// }

// class B {
//     public void demo() {
//         System.out.println("this is from B");
//     }
// }

public class FunctionalInterfaceDemo {
    static int x = 10;

    public int FunctionalInterfaceDemo() {
        return 10;
    }

    public static void main(String[] args) {
        System.out.println(x + 5);

        // I i1 = new A();
        // i1.abc();

        // I i2 = new I() {
        // public void abc() {
        // System.out.println("Hello Everyone from anonomous class");
        // }
        // };
        // i2.abc();
        // B b1 = new B();
        // b1.demo();

        // B b2 = new B() {
        // public void demo() {
        // System.out.println("Changed functionality of class using anonomous class");
        // }
        // };
        // b2.demo();

        // I i3 = () -> System.out.println("Hello from lambda expression");
        // i3.abc();
    }
}
