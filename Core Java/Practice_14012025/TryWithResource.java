package Practice_14012025;

class A implements AutoCloseable {
    A() {
        System.out.println("Creating Resource A");
    }

    public void process() {
        System.out.println("Processing Resource A");
    }

    public void close() {
        System.out.println("Destroying Resource A");
    }

}

class B implements AutoCloseable {
    B() {
        System.out.println("Creating Resource B");
    }

    public void process() {
        System.out.println("Processing Resource B");
    }

    public void close() {
        System.out.println("Destroying Resource B");
    }

}

public class TryWithResource {
    public static void main(String[] args) {
        try (A a = new A(); B b = new B();) {
            a.process();
            b.process();
            throw new NullPointerException();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("End of main");
    }
}
