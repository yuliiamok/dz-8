package pack1;
public class Main {
    public static void main(String[] args) {

        StudentsGroup group = new StudentsGroup(new Student("captname1", "captsurname1"));
        Student student1 = new Student("name1", "surname1");
        group.addStudent(student1);
        Student student2 = new Student("name2", "surname2");
        group.addStudent(student2);
        Student student3 = new Student("name3", "surname3");
        group.addStudent(student3);
        Student student4 = new Student("name4", "surname4");
        group.addStudent(student4);
        Student student5 = new Student("name5", "surname5");
        group.addStudent(student5);

        group.addTask("Learn Conditions and Loops");
        System.out.println("New task 'Learn Fields and Methods' is added");
        System.out.println(group);

        // Assign tasks to student1 and student3
        group.setTaskDoneByStudent("Learn Fields and Methods", student1);
        group.setTaskDoneByStudent("Learn Incapsulation", student3);

        System.out.println("--------------------------------------------");
        System.out.println("Before deleting student2:");
        System.out.println(group);
        group.deleteStudent(student2);
        System.out.println("After deleting student2:");
        System.out.println(group);

        System.out.println("--------------------------------------------");
        System.out.println("Checking if tasks are done by student1 and student3:");
        System.out.printf("'Learn Fields and Methods' task is done by student1: %s%n", group.isTaskDone("Learn Fields and Methods", student1));
        System.out.printf("'Learn Fields and Methods' task is done by student3: %s%n", group.isTaskDone("Learn Fields and Methods", student3));

        System.out.println("--------------------------------------------");
        System.out.println("Before changing captain:");
        System.out.println(group);
        group.changeCaptain(student3);
        System.out.println("After changing captain:");
        System.out.println(group);
    }
}
