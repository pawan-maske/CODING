package CodingJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        int[] arr = {2, 13, 74, 15, 26, 17, 778, 94, 2, 25};
        int[] arr2 = new int[]{2,3,4,5};
        List<Integer> list = Arrays.asList(2, 13, 74, 15, 26, 17, 778, 94, 2, 25);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 7, 4, 2, 5));
        //Arrays.sort(arr);
        Comparator<Integer> integerComparator = (i, j) -> i % 10 > j % 10 ? 1 : -1;
        List<Integer> list1 = Arrays.stream(arr).boxed().sorted(integerComparator).toList();
        System.out.println(list1);

        String[] strArr = {"Pawan", "Manohar", "Rahul", "Rajesh", "TanmayKumar", "Tarun"};
        int size = Arrays.stream(strArr).filter(s -> s.length() > 5).collect(Collectors.toList()).size();
        System.out.println(size);

    }
}
