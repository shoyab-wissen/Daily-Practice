package Practice_07022025;

public class BuilderDemo {
    public static void main(String[] args) {
        Student st = new Student.StudentBuilder().age(22).name("Shoyab Siddique").division("A").standard(15).rollNo(10)
                .build();
        System.out.println(st);

    }
}

class Employee {
    private String name;
    private int age;
    private String desingation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesingation() {
        return desingation;
    }

    public void setDesingation(String desingation) {
        this.desingation = desingation;
    }

}