package Practice_06022025;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee {
    String name;
    int age;
    double salary;
    String designation;

    public Employee(String name, int age, double salary, String designation) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", designation=" + designation + "]";
    }

}

public class StreamDemo3 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Shoyab Siddique", 22, 9999999, "Developer"));
        employees.add(new Employee("Sanjana Panda", 22, 9999999, "Developer"));
        employees.add(new Employee("Kaif", 21, 100, "Clerk"));
        employees.add(new Employee("Omkar", 21, 200, "Manager"));
        employees.add(new Employee("Sarvesh", 21, 3000, "Clerk"));
        employees.add(new Employee("Sanchit", 21, 4000, "Manager"));

        System.out.println(employees.stream().collect(Collectors.partitioningBy(emp -> emp.age == 22)));
        System.out.println("------------------------------------------");
        System.out.println(employees.stream().collect(Collectors.groupingBy(emp -> emp.designation)));
        System.out.println("------------------------------------------");
        System.out.println(
                employees.stream().collect(Collectors.groupingBy(emp -> emp.designation, Collectors.counting())));
        System.out.println("------------------------------------------");
        System.out.println(
                employees.stream().collect(Collectors.groupingBy(emp -> emp.age < 22)));
    }
}
