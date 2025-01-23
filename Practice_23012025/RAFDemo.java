package Practice_23012025;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;

public class RAFDemo {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile(new File("abc.txt"), "rw")) {
            raf.seek(3);
            System.out.println(raf.readLine());
            System.out.println(raf.readLine());
            raf.seek(raf.length());
            raf.writeBytes("This is written by program\n");
            raf.writeInt(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (PrintWriter pw = new PrintWriter(System.out)) {
            pw.println("This is written using print writer");
            // pw.flush();
        }
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("abc.txt", true))) {
            pw.println("Hello Duniya");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
