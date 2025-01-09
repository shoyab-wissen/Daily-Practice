interface MarkerInterface {
}

class Student {
    final void doSomething() {
        if (this instanceof MarkerInterface)
            System.out.println("This does something that it should not");
        else
            throw new NullPointerException();
    }
}

class Geek extends Student implements MarkerInterface {
    Geek() {
        this.doSomething();
    }
}

public class MarkerInterfaceDemo {
    public static void main(String[] args) {
        Geek g = new Geek();
    }
}
