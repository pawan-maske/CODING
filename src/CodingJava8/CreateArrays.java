package CodingJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CreateArrays {
    public static void main(String[] args) {

        String[] arr1 = {"Pawan", "Maske"};
        int[] arr2 = new int[5];
        int count = 0;
        for (int i : arr2) {
            arr2[i] = count++;
        }
        int[] arr3 = new int[]{1, 2, 3, 4, 5};
        String arr[] = {"pawan", "maske"};
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("John");
        list1.add("Doe");
        list2.add("Jane");
        list2.add("Doe");
        list1.addAll(list2);

        IntStream.range(1, 100).filter(n -> n % 2 == 0).map(n -> n + n).forEach(System.out::println);

        //200 - Sucess/ Request Completed -
            //200 OK
            //201 Created
            //203 Deleted/No Content
        //300 - Rerouting or Redirectional
            //301 Redirectional permanent
            //302 Redirectional temp
        //400 - Client Side request errors
            //401 Auth failed
            //403 Access Denied
            //404 Not Found
        //500 - Server Side Errors
            //503 - Service Unavailable

    }
}
