package Practice_20012025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PatternPractice {

    static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if (!s2.contains(s1.charAt(i) + "")) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream(new FileOutputStream(
                "C:\\Users\\Wissen\\Desktop\\Project\\Daily Practice\\Practice_20012025\\output.txt", true)));
        // System.setIn(new FileInputStream(
        // "C:\\Users\\Wissen\\Desktop\\Project\\Daily
        // Practice\\Practice_20012025\\output.txt"));
        // Scanner sc = new Scanner(System.in);
        // while (sc.hasNextLine()) {
        // System.out.println(sc.nextLine());
        // }
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println(isPalindrome("racecar"));
        System.out.println(isAnagram("hello", "hells"));
    }
}
