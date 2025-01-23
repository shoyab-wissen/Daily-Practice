package Practice_22012025;

class A {
    public class B {
        public class C {
            public void demo() {
                System.out.println("I am coming from the innermost class method");
            }
        }
    }

    static class D {
        class E {
            public static void demo() {
                System.out.println("From Innermost Static Method");
            }
        }
    }
}

public class InnerClasses {
    public static void main(String args[]) {
        // c.demo();
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        c.demo();

        // A.D.E e = new A.D.E();
        // e.demo();
        // new A.D().new E().demo();
        new A.D().new E().demo();
    }
}