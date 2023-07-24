package pack1;

import java.util.*;

public class StudentsGroup {

    private Student captain;
    final private Set<Student> students = new LinkedHashSet<>();
    final private Map<String, Set<Student>> tasks = new HashMap<>();

    public StudentsGroup(Student captain) {
        this.captain = captain;
        this.students.add(captain);
    }
    public void addTask(String task) {
        tasks.putIfAbsent(task, new LinkedHashSet<>());
    }
    public void changeCaptain(Student captain) {
        this.captain = captain;
        this.students.add(captain);
    }

    final public void addStudent(Student student) {
        this.students.add(student);
    }
    public void deleteStudent(Student student) {
        if (student.equals(captain)) {
            System.out.println("Before deleting the student, please select a new captain!");
        } else {
            for (Map.Entry<String, Set<Student>> entry : tasks.entrySet()) {
                entry.getValue().remove(student);
            }
            students.remove(student);
        }
    }
    public boolean isTaskDone (String task, Student student) {
        if (tasks.containsKey(task)) {
            return tasks.get(task).contains(student);
        } else {
            return false;
        }
    }
    public void setTaskDoneByStudent(String task, Student student) {
        tasks.putIfAbsent(task, new LinkedHashSet<>());
        tasks.get(task).add(student);
    }

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "captain=" + captain +
                ", students=" + students +
                ", tasks=" + tasks +
                '}';
    }

}
