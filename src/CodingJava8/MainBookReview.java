package CodingJava8;

import java.util.*;
import java.util.stream.Collectors;

public class MainBookReview {
    public static void main(String[] args) {
//        List<String> arrayStr = Arrays.asList("java", "SpringBoot", "sql", "Scala", "Docker");
//        List<String> collect = arrayStr.stream().filter(str -> str.length() > 5).map(String::toUpperCase).collect(Collectors.toList());
//        System.out.println(collect);
//
//        //First non-repetitive char
//        String str = "ilovejavatechie";
//        String s1 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//                .entrySet().stream().filter(e -> e.getValue() == 1).map(s -> s.getKey()).collect(Collectors.toList()).get(0);
//        System.out.println(s1);
//
//        //find the nth highest salary
//        int[] arr1 = {244,3,44,5,22,45,6};
//
//        Integer i = Arrays.stream(arr1).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(2);
//        System.out.println(i);


        List<BookReview> list = Arrays.asList(
                new BookReview("Book1", "good", 4.4),
                new BookReview("Book2", "Best", 3.5),
                new BookReview("Book3", "worst", 1),
                new BookReview("Book3", "Okayiesh", 3),
                new BookReview("Book1", "nice, liked it", 5),
                new BookReview("Book3", "Very Bad Book", 2)
        );
        //list.stream().collet()
        Map<String, List<BookReview>> collect1 = list.stream().filter(br->br.getRating()>2).collect(Collectors.groupingBy(br -> br.getBookId()));

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<String, String> hashMap = new HashMap<>();
        HashSet<Integer> hashSet = new HashSet<>();

        Random rand = new Random();
        for(int j=0;j<10;j++){
            linkedList.add(rand.nextInt());
        }

        Node head =new Node(1);
        head.next=new Node(23);
        head.next.next=new Node(31);
        head.next.next=new Node(31);
        head.next.next.next=new Node(31);
        head.next.next.next.next=new Node(31);






    }
}

