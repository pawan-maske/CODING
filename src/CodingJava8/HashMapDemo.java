package CodingJava8;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("Pawan", "25");
        map.put("Shravan", "33");
        map.put("Nayan", "55");

        ConcurrentHashMap<String, String> cMap = new ConcurrentHashMap<>();
        map.put("Pawan", "25");
        map.put("Shravan", "33");
        map.put("Nayan", "55");

        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println("Inside Map");
        }

        for(String s: map.keySet()){

        }
        for(String s: map.values()){

        }

        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(2);

        Iterator itr = list.iterator();

        while(itr.hasNext()){
            if((Integer)itr.next()%2==0){
                System.out.println((Integer)itr.next());}
            list.remove(2);

        }

    }

    public void main(int num){
        int num2 =5;
    }

    public static void switchCase(){
        int checkNumber = 2;
        switch(checkNumber) {
            case 1,7:
                System.out.println("odd number") ;
            case 2,8:
                System.out.println("even number") ;
            default:
                System.out.println("not a number");
        }
    }
}
