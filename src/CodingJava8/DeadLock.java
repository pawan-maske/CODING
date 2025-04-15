package Coding2AdvancedJava;

import java.util.List;
import java.util.Objects;

public class DeadLock {

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        RunnableThread r1 = new RunnableThread(obj1, obj2);
        RunnableThread r2 = new RunnableThread(obj1, obj2);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }

    public static class Employee {
        private int id;
        private String name;
        private String dept;
        private List<Main.Project> projects;
        private double salary;
        private String gender;
        public Employee(int id, String name, String dept, List<Main.Project> projects, double salary, String gender) {
            this.id = id;
            this.name = name;
            this.dept = dept;
            this.projects = projects;
            this.salary = salary;
            this.gender = gender;

        }
        public int getId() {
            return id;

        }
        public void setId(int id) {
            this.id = id;

        }
        public String getName() {
            return name;

        }
        public void setName(String name) {
            this.name = name;

        }
        public String getDept() {
            return dept;

        }
        public void setDept(String dept) {
            this.dept = dept;

        }
        public List<Main.Project> getProjects() {
            return projects;

        }
        public void setProjects(List<Main.Project> projects) {
            this.projects = projects;

        }
        public double getSalary() {
            return salary;

        }
        public void setSalary(double salary) {
            this.salary = salary;

        }
        public String getGender() {
            return gender;

        }
        public void setGender(String gender) {
            this.gender = gender;

        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, dept, projects, salary, gender);

        }
        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", dept='" + dept + '\'' +
                    ", projects=" + projects +
                    ", salary=" + salary +
                    ", gender='" + gender + '\'' +
                    '}';

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return id == employee.id && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(dept, employee.dept) && Objects.equals(projects, employee.projects) && Objects.equals(gender, employee.gender);
        }
    }
}
