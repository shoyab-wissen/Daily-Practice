package practice_24012025;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import Practice_24012025.Person;

public class Deserializing {
    public static void main(String[] args) {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
        Person p = (Person) ois.readObject();
        System.out.println(p.age);
        System.out.println(p.name);
    }
}