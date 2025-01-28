package Practice_16012025;

public class A {
    public static void main(String[] args) {
        B b = null;
        try {
            b = new B("B");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println(b);
    }
}

class B {
    String name;

    B(String name) throws Exception {
        this.name = name;
        throw new Exception();
    }
}