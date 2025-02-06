package Practice_06022025;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 23, 12, 43, 65, 32, 54, 76, 23, 546, 652, 35, 76, 87, 235, 465, 344);
        System.out.println(list);

        Predicate<Integer> p1 = (x) -> x % 2 == 0;
        Stream<Integer> s = list.stream();
        Stream<Integer> en = s.filter(p1);
        List<Integer> eList = en.collect(Collectors.toList());
        System.out.println(eList);
        System.out.println(list.stream().filter(p1.negate()).collect(Collectors.toList()));

        List<Integer> doubleTheValues = list.stream().map(x -> x * 2).collect(Collectors.toList());
        System.out.println(doubleTheValues);
        List<Integer> sortedValues = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedValues);
        List<Integer> limitFive = list.stream().limit(5).collect(Collectors.toList());
        System.out.println(limitFive);
        List<Integer> skipTwo = list.stream().skip(2).sorted().limit(5).collect(Collectors.toList());
        System.out.println(skipTwo);
        // -------------------------------------------------------------------------------------------------------
        Random random = new Random();
        random.ints().map(x -> Math.abs(x)).limit(10).forEach(System.out::println);
        // -------------------------------------------------------------------------------------------------------
        IntStream is = IntStream.range(1, 11);
        is.forEach(System.out::println);
        IntStream is1 = IntStream.rangeClosed(1, 11);
        is1.forEach(System.out::println);
        // -------------------------------------------------------------------------------------------------------
        Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);
        System.out.println(sum.orElse(0));
        Optional<Integer> prod = list.stream().reduce((a, b) -> a * b);
        System.out.println(prod.orElse(0));
        // -------------------------------------------------------------------------------------------------------
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).reduce(10, (a, b) -> a + b));
        System.out.println(
                Arrays.asList(1, 2, 3).parallelStream().reduce(10, (a, b) -> a + b,
                        (a, b) -> a * b));
        // -------------------------------------------------------------------------------------------------------
        IntSummaryStatistics statistics = IntStream.range(1, 5).summaryStatistics();
        System.out.println(statistics);
    }
}