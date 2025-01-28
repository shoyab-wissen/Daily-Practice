package Practice_20012025;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.OutputStream;

public class RuntimeDemo {
    public static void main(String[] args) throws IOException, AWTException, InterruptedException {
        Runtime runtime = Runtime.getRuntime();
        int index = 0;
        while (true) {
            runtime.exec("notepad hello" + (index++) + ".java");

            Thread.sleep(200);
            System.out.println("Process 1 started");
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyPress(KeyEvent.VK_H);
            Thread.sleep(200);
            r.keyPress(KeyEvent.VK_E);
            Thread.sleep(200);
            r.keyPress(KeyEvent.VK_L);
            Thread.sleep(200);
            r.keyPress(KeyEvent.VK_L);
            Thread.sleep(200);
            r.keyPress(KeyEvent.VK_O);
            Thread.sleep(5000);
        }
        // p1.destroy();
    }
}
