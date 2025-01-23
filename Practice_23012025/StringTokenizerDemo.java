package Practice_23012025;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String data = "Shoyab Siddique|22|100000000000000000000000000000000000:Programmer_8169915345 |shoyabsiddique@gmail.com;Mumbai, Maharastra";
        StringTokenizer tokenizer = new StringTokenizer(data, "|;,:_");
        for (int i = 0; i < tokenizer.countTokens(); i++) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
