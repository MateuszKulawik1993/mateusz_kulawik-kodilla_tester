package stream;

import optional.homework.Student;
import optional.homework.Teacher;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {
    @Test
    public void testStudentWithTeacher() {
        Teacher teacher = new Teacher("Tomasz Nowak");
        Student student = new Student("Jan Kowalski", teacher);

        Optional<Teacher> result = student.getTeacher();

        assertTrue(result.isPresent());
        assertEquals("Tomasz Nowak", result.get().getName());
    }

    @Test
    public void testStudentWithoutTeacher() {
        Student student = new Student("Anna Nowak", null);

        Optional<Teacher> result = student.getTeacher();

        assertFalse(result.isPresent());
    }

    @Test
    public void testOptionalTeacherOrElse() {
        // Given
        Student student = new Student("Piotr Malinowski", null);

        // When
        String teacherName = student.getTeacher().map(Teacher::getName).orElse("<undefined>");

        // Then
        assertEquals("<undefined>", teacherName);
    }

    @Test
    public void testOptionalTeacherOrElseWithTeacher() {
        Teacher teacher = new Teacher("Magdalena Wiśniewska");
        Student student = new Student("Zofia Kruk", teacher);

        String teacherName = student.getTeacher().map(Teacher::getName).orElse("<undefined>");

        assertEquals("Magdalena Wiśniewska", teacherName);
    }
}
