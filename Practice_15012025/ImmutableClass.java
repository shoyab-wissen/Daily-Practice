package Practice_15012025;

final class Student {
    private final int rollNo;
    private final String name;
    private final int standard;

    Student(int rollNo, String name, int standard) {
        this.rollNo = rollNo;
        this.name = name;
        this.standard = standard;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getStandard() {
        return standard;
    }

    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Standard: " + standard;
    }

    public int hashCode() {
        return rollNo;
    }

    public boolean equals(Student obj) {
        Student s1 = (Student) obj;
        return rollNo == s1.rollNo && name.equals(s1.name) && standard == s1.standard;
    }
}

record StudentRecord(
        int rollNo, String name,
        String schoolName,
        int standard) {

    public StudentRecord {

        if (rollNo < 0) {
            throw new IllegalArgumentException("Roll No cannot be negative");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (standard < 1 || standard > 12) {
            throw new IllegalArgumentException("Standard must be between 1 and 12");
        }
    }

    public StudentRecord(int rollNo, String name, int standard) {
        this(rollNo, name, "XYZ School", standard);
    }
}

public class ImmutableClass {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Shoyab", 10);
        System.out.println(s1);
        Student s2 = new Student(2, "Shoyab", 11);
        System.out.println(s2);
        Student s3 = new Student(1, "Shoyab", 10);
        System.out.println(s3);
        System.out.println(s1.equals(s3));

        StudentRecord sr1 = new StudentRecord(1, "Shoyab", 10);
        System.out.println(sr1);
        StudentRecord sr2 = new StudentRecord(1, "Shoyab", 11);
        System.out.println(sr2);
        System.out.println(sr1.equals(sr2));
    }
}
