package Practice_06022025;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Shoyab");
        map.put(2, "Sanjana");
        map.put(3, "Kaif");
        map.put(4, "Sanchit");
        map.put(5, "Omkar");
        map.put(6, "Sarvesh");
        map.put(7, "Johnson");

        map.entrySet().stream().map(Map.Entry::getKey).forEach(System.out::println);
        System.out.println("-----------------------------------");
        map.entrySet().stream().map(Map.Entry::getValue).forEach(System.out::println);
        System.out.println("-----------------------------------");
        map.entrySet().stream().filter(m -> m.getKey() > 4).forEach(System.out::println);
        System.out.println("-----------------------------------");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list1 = Arrays.asList(6, 7, 8, 9, 10);
        List<Integer> list2 = Arrays.asList(19, 20, 21, 22, 23);

        Set<Integer> set = new TreeSet<>();
        set.add(34);
        set.add(12);
        set.add(54);
        set.add(35);

        List<List<Integer>> mergedList = Arrays.asList(list, list1, list2);
        List<Collection<Integer>> mergedListMixed = Arrays.asList(list, list1, list2, set);
        mergedList.stream().map(x -> x.stream().map(y -> y + y).collect(Collectors.toList()));
        System.out.println(mergedList.stream().map(x -> x.stream().map(y -> y + y).collect(Collectors.toList()))
                .collect(Collectors.toList()));
        System.out
                .println(mergedList.stream().flatMap(lst -> lst.stream()).map(x -> x + x).collect(Collectors.toList()));
        System.out
                .println(mergedListMixed.stream().flatMap(lst -> lst.stream()).map(x -> x + x)
                        .collect(Collectors.toList()));

    }
}
