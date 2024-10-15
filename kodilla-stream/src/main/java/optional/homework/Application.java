package optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Jan Kowalski", new Teacher("Tomasz Nowak")));
        students.add(new Student("Anna Nowak", null)); // bez nauczyciela
        students.add(new Student("Piotr Malinowski", new Teacher("Marek Zielinski")));
        students.add(new Student("Ewa Kwiatkowska", null)); // bez nauczyciela
        students.add(new Student("Zofia Kruk", new Teacher("Magdalena Wiśniewska")));

        for (Student student : students) {
            String teacherName = student.getTeacher()
                    .map(Teacher::getName)
                    .orElse("<undefined>");

            System.out.println("Uczeń: " + student.getName() + ", nauczyciel: " + teacherName);
        }
}
