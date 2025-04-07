package CodingJava8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main2 {
    public static void main(String[] args) {
        String str = "PawanMaskePTest";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
        Map.Entry<String, Long> stringLongEntry = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(s -> s.getValue() == 1).findFirst().get();

        List<BookReview> list = Arrays.asList(
                new BookReview("Book1", "good", 4.4),
                new BookReview("Book2", "Best", 3.5),
                new BookReview("Book3", "worst", 1),
                new BookReview("Book3", "Okayiesh", 3),
                new BookReview("Book1", "nice, liked it", 5),
                new BookReview("Book3", "Very Bad Book", 2)
        );

        System.out.println(stringLongEntry.getKey());
        String str2 = "Pawan Java MySQL Microservices";

        String[] str1 = {"Pawan", "Java", "MySQL", "Microservices", "Pawan", "Java"};
        Arrays.stream(str1).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        String collect2 = Arrays.stream(str1).collect(Collectors.joining(" "));
        String s = Arrays.stream(str1).reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get();
        System.out.println(s);
        List<String> collect = Arrays.stream(str1).sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(collect);

        int[] arr = {2, 11, 3, 4, 5, 21, 1};
        List<String> collect1 = Arrays.stream(arr).boxed().map(i -> i + "").filter(s2 -> s2.startsWith("1")).toList();
        System.out.println(collect2);

        String pawap = "Pawan";
        boolean b = IntStream.range(0, pawap.length() / 2).allMatch(i -> pawap.charAt(i) == pawap.charAt(pawap.length() - 1 - i));
        System.out.println(b);

        //IntStream.range(0, pawap.length()).forEach(i->permute(pawap.substring(0,i)+pawap.substring(i+1), ""+pawap.charAt(i)));
        boolean d = IntStream.range(0, pawap.length() / 2).allMatch(i -> pawap.charAt(i) == pawap.charAt(pawap.length() - 1 - i));
        System.out.println(d);
    }


}
