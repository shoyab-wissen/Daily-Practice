package Practice_15012025;

import Practice_15012025.Manager;

public class NewSwitch {
    public static void main(String[] args) {
        int x = 2;
        // Java introduced dynamic variable which can be assigned a value at compile
        // time
        var dynamicVariable = "Hello";
        System.out.println(dynamicVariable);
        // This will give an error as dynamicVariable is of type String
        // dynamicVariable = 10;

        // we can also assign arrays to dynamic variables
        var dynamicArr = new int[] { 1, 2, 3 };
        System.out.println(dynamicArr[0]);

        // we can also assign objects to dynamic variables
        var dynamicObject = new Manager();
        dynamicObject.display();

        // switch case introduced -> for eliminating break in switch statement
        switch (x) {
            case 1 -> System.out.println("One");
            case 2 -> {
                System.out.println("Two");
                System.out.println("Can also write multiple lines of code in the single block without break");
            }
            case 3 -> System.out.println("Three");
            default -> System.out.println("Invalid");
        }

        enum Days {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

        // using switch statement we can also return a value directly to a variable by
        // making use of ->
        // also we can combine multiple cases in a single case in switch statement

        String holiday = switch (Days.FRIDAY) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> "Working day";
            case FRIDAY -> "Holiday";
            case SATURDAY, SUNDAY -> "Weekend";
        };

        System.out.println("Today is " + holiday);
    }
}
