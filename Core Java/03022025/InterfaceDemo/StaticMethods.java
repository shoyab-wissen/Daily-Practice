package InterfaceDemo;

public interface StaticMethods {
    public static void main(String[] args) {
        System.out.println("Hello Guys");
        I.atoz();
        ABC a = new ABC();
        a.xyz();
        a.abc();
    }
}

interface I {
    public void abc();

    default public void xyz() {
        System.out.println("Some Logic");
        demo();
    }

    public static void atoz() {
        System.out.println("This is atoz");

    }

    private void demo() {
        System.out.println("this is from private method");
    }
}

class ABC implements I {

    @Override
    public void abc() {
        System.out.println("This is overrided abc");
    }

}

interface X {
    public default void hello() {
        System.out.println("Hello from hello of X");
    }
}

interface Y {
    public default void hello() {
        System.out.println("Hello from hello of Y");
    }
}

class B implements X, Y {

    @Override
    public void hello() {
        X.super.hello();
        Y.super.hello();
    }

}