package CodingJava8;

import java.util.Objects;

public class Student1 {
    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    private int Marks;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return Marks == student1.Marks && Objects.equals(name, student1.name) && Objects.equals(Subject, student1.Subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Marks, name, Subject);
    }

    private String name;
    private String Subject;
}
