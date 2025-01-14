package Practice_14012025;

import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile(".*@*.*");
        pattern = Pattern.compile(".*@.*\\..*");
        pattern = Pattern.compile(".*@.*\\.com");
        pattern = Pattern.compile("[a-zA-Z].*@.*\\.com");
        System.out.println(pattern.matcher("abc@xyz.com").matches());
        // pattern for 10 digit phone number that starts with 9 or 8
        pattern = Pattern.compile("[89][0-9]{9}");
        System.out.println(pattern.matcher("7876543210").matches());
    }
}
