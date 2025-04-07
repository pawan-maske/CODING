package CodingJava8;

import java.util.*;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Student> studentList = Arrays.asList(
                new Student(1,"Pawan", 25, "Male", "Civil", "CSN", 50, Arrays.asList("+919890189559", "+919890189999")),
                new Student(2,"Shravan", 25, "Male", "CS", "Nagar", 55, Arrays.asList("+919890189999")),
                new Student(3,"Shreyash", 26, "Male", "Entc", "CSN", 120, Arrays.asList("+919890189599", "+919890189909")),
                new Student(4,"Ann", 24, "Female", "Mech", "Pune", 1, Arrays.asList("+919898189559")),
                new Student(4,"Anu", 23, "Female", "Civil", "CSN", 3, Arrays.asList("+919898189559")),
                new Student(5,"Anay", 24, "Male", "Mech", "Pune", 73, Arrays.asList("+919898189559")),
                new Student(6,"Ramya", 24, "Female", "Mech", "Ratlam", 300, Arrays.asList("+919898189559", "+919890189999")),
                new Student(6,"Bina", 24, "Female", "Mech", "CSN", 67, Arrays.asList("+919898189559"))
        );


        int rank = studentList.stream().reduce((s1, s2) -> s1.getRank() < s2.getRank() ? s1 : s2).get().getRank();
        Map<String, Long> collect = studentList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println(collect);



    }
}