package Practice_22012025;

import java.util.Comparator;
import java.util.TreeSet;

class A<Type> {
    public void add(Type a, Type b) {
        System.out.println("Generic Logic......");
    }
}

class Student implements Comparable {
    private int rollNo;
    private String name;
    private int std;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStd() {
        return std;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", std=" + std + "]";
    }

    public void setStd(int std) {
        this.std = std;
    }

    Student(int rn, String name, int std) {
        this.rollNo = rn;
        this.name = name;
        this.std = std;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        return s.rollNo - this.rollNo;
    }
}

class Employee {
    private int rollNo;
    private String name;
    private int std;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStd() {
        return std;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", std=" + std + "]";
    }

    public void setStd(int std) {
        this.std = std;
    }

    Employee(int rn, String name, int std) {
        this.rollNo = rn;
        this.name = name;
        this.std = std;
    }
}

class NameSorter implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }

}

class RollNoSorter implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.valueOf(o1.getRollNo()).compareTo(o2.getRollNo());
    }

}

class StandardSorted implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.valueOf(o1.getStd()).compareTo(o2.getStd());
    }
}

public class CustomGeneric {

    public static void main(String[] args) {
        A<Integer> a = new A<Integer>();
        A<String> b = new A<String>();
        A<Double> c = new A<>();
        a.add(1, 3);
        b.add("Shoyab", "Siddique");
        c.add(1.2, 1.2);
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(new Student(1, "Shoyab", 10));
        ts.add(new Student(2, "Sanjana", 10));
        ts.add(new Student(3, "Atharva", 10));
        ts.add(new Student(4, "Aditi", 10));
        ts.add(new Student(5, "Nidhi", 10));
        System.out.println(ts);
        TreeSet<Employee> tse = new TreeSet<>(new NameSorter());
        tse.add(new Employee(1, "Shoyab", 10));
        tse.add(new Employee(2, "Sanjana", 10));
        tse.add(new Employee(3, "Atharva", 10));
        tse.add(new Employee(4, "Aditi", 10));
        tse.add(new Employee(5, "Nidhi", 10));
        System.out.println(tse);
    }
}
