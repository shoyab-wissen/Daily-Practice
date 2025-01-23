package Practice_23012025;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

public class IODemo {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the name of the file: ");
            String fileName = br.readLine();
            File f = new File(fileName);
            if (f.exists()) {
                BufferedReader fr = new BufferedReader(new FileReader(f));
                String line = null;
                while ((line = fr.readLine()) != null) {
                    line = fr.readLine();
                    System.out.println(line);
                }
                fr.close();
            } else {
                System.out.println("The file name does not exist");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
