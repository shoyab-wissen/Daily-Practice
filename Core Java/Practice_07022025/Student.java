package Practice_07022025;

public class Student {
    private String name;
    private int age;
    private int rollNo;
    private int standard;
    private String division;

    private Student(String name, int age, int rollNo, int standard, String division) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.standard = standard;
        this.division = division;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getStandard() {
        return standard;
    }

    public String getDivision() {
        return division;
    }

    public static class StudentBuilder {
        private String name;
        private int age;
        private int rollNo;
        private int standard;
        private String division;

        public StudentBuilder name(String name) {
            this.name = name;
            return (this);
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder rollNo(int rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public StudentBuilder standard(int standard) {
            this.standard = standard;
            return this;
        }

        public StudentBuilder division(String division) {
            this.division = division;
            return this;
        }

        public Student build() {
            Student st = new Student(name, age, rollNo, standard, division);
            return st;
        }
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", rollNo=" + rollNo + ", standard=" + standard
                + ", division=" + division + "]";
    }

}
