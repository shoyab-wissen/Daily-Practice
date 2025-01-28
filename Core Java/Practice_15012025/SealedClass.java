package Practice_15012025;

// Sealed class can be extended only by the classes that are permitted to extend it.
sealed class Manager permits SalesManager, MarketingManager {
    int x = 10;

    public void display() {
        System.out.println("Manager class");
    }
}

// To extend from a sealed class, the subclass must be declared as final, sealed
// or non-sealed.
final class SalesManager extends Manager {
    public void display() {
        System.out.println("Sales Manager class");
    }
}

// sealed class can extends another sealed class
sealed class MarketingManager extends Manager permits SeniorMarketingManager {
    public void display() {
        System.out.println("Marketing Manager class");
    }
}

// Once non-sealed the class can be extended by any class
non-sealed class SeniorMarketingManager extends MarketingManager {
    public void display() {
        System.out.println("Senior Marketing Manager class");
    }
}

// Peon can access SeniorMarketingManager class and also all the methods and
// variables of Markerting class
class Peon extends SeniorMarketingManager {
    public void display() {
        System.out.println("Peon class");
        System.out.println("x = " + x);
    }
}

public class SealedClass {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.display();
        SalesManager sm = new SalesManager();
        sm.display();
        MarketingManager mm = new MarketingManager();
        mm.display();
        SeniorMarketingManager smm = new SeniorMarketingManager();
        smm.display();
        Peon p = new Peon();
        p.display();
    }
}