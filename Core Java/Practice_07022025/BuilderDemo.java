package Practice_07022025;

public class BuilderDemo {
    public static void main(String[] args) {
        Student st = new Student.StudentBuilder().age(22).name("Shoyab Siddique").division("A").standard(15).rollNo(10)
                .build();
        System.out.println(st);
    }
}
