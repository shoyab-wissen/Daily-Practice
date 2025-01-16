package Practice_15012025;

class EarlyInstantiation {
    private static EarlyInstantiation instance = new EarlyInstantiation();

    private EarlyInstantiation() {
    }

    public static EarlyInstantiation getInstance() {
        return instance;
    }
}

class LazyInstantiation {
    private static LazyInstantiation instance = null;

    private LazyInstantiation() {
    }

    public static LazyInstantiation getInstance() {
        if (instance == null) {
            instance = new LazyInstantiation();
        }
        return instance;
    }
}

public class Singleton {
    public static void main(String[] args) {
        EarlyInstantiation ei1 = EarlyInstantiation.getInstance();
        EarlyInstantiation ei2 = EarlyInstantiation.getInstance();
        System.out.println(ei1 == ei2);

        LazyInstantiation li1 = LazyInstantiation.getInstance();
        LazyInstantiation li2 = LazyInstantiation.getInstance();
        System.out.println(li1 == li2);
    }
}
