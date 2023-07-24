package pack1;

public class Student {
    static private int counter = 0;
    final public int studentId;
    final public String name;
    final public String surname;
    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.studentId = ++ counter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
