package Coding2AdvancedJava;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String[] str1 = {"Pawan", "Java", "MySQL", "Microservices"};

        String collect2 = Arrays.stream(str1).collect(Collectors.joining(" "));
        String s = Arrays.stream(str1).reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get();
        System.out.println(s);

        String[] str2 = {"Pawan", "Java", "MySQL", "Microservices", "Pawan", "Java"};
        LinkedHashMap<String, Long> collect = Arrays.stream(str2).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        String s1 = Arrays.stream(str2).reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get();
        System.out.println(s1);
        try{
            int[] arr = new int[Integer.MAX_VALUE];
        } catch(Error e){
            System.out.println("Pawan2");
        } finally{
            System.out.println("Pawan3");
        }
    }

    public static class Main {
        public static void main(String[] args) {
    //        List<Employee> empList=EmployeeDataBase.getEmployees();
    //        // Employee emp1=new Employee(1,"John Doe","Development", Arrays.asList(p1,p2),8000,"Male");
    //        empList.stream().filter(e -> e.getId() == 1).flatMap(e -> e.getProjects().stream()).forEach(p->System.out.println(p.getName()));
            //789
            //456
            //123
            int a = 9;
            int n = 3;
            if(a%n==0){
                for(int i=n;i<)
            } else ()

        }
    }

    public static class Project {
        private String projectCode;
        private String name;
        private String client;
        private String leadName;
        public Project(String projectCode, String name, String client, String leadName) {
            this.projectCode = projectCode;
            this.name = name;
            this.client = client;
            this.leadName = leadName;

        }
        public String getProjectCode() {
            return projectCode;

        }
        public void setProjectCode(String projectCode) {
            this.projectCode = projectCode;

        }
        public String getName() {
            return name;

        }
        public void setName(String name) {
            this.name = name;

        }
        public String getClient() {
            return client;

        }
        public void setClient(String client) {
            this.client = client;

        }
        public String getLeadName() {
            return leadName;

        }
        public void setLeadName(String leadName) {
            this.leadName = leadName;

        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Project project = (Project) o;
            return Objects.equals(projectCode, project.projectCode) && Objects.equals(name, project.name) && Objects.equals(client, project.client) && Objects.equals(leadName, project.leadName);

        }
        @Override
        public int hashCode() {
            return Objects.hash(projectCode, name, client, leadName);

        }
        @Override
        public String toString() {
            return "Project{" +
                    "projectCode='" + projectCode + '\'' +
                    ", name='" + name + '\'' +
                    ", client='" + client + '\'' +
                    ", leadName='" + leadName + '\'' +
                    '}';

        }

    }
}
