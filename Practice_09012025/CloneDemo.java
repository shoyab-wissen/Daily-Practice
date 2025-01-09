class Student implements Cloneable {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (Exception e) {
            System.out.println("Exception");
        }
        return null;
    }
}

class CloneDemo {

    public static void main(String[] args) {
        Student s1 = new Student("Raju", 22);
        Student s2 = (Student) s1.clone();

        System.out.println(s1);
        System.out.println(s2);
    }
}