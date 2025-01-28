package Practice_24012025;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.File;
import java.io.FileOutputStream;
import Practice_24012025.Person;

public class Serializing {

    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.age = 22;
        p.name = "Shoyab";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
        oos.writeObject(p);
        oos.close();
    }
}
