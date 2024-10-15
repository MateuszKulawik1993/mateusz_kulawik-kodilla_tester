package stream;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStats{
    private List<User> generateTestUsers() {
        return Arrays.asList(
                new User("User1", 45, 10, "Group1"),
                new User("User2", 30, 50, "Group2"),
                new User("User3", 50, 100, "Group3"),
                new User("User4", 25, 20, "Group4"),
                new User("User5", 40, 60, "Group5"),
                new User("User6", 18, 0, "Group6"),
                new User("User7", 55, 200, "Group7")
        );
    }

    @Test
    public void testCalculateAverageForUsers40AndAbove() {
        List<User> users = generateTestUsers();

        double result = ForumStats.calculateAverageForUsers40AndAbove(users);

        assertEquals(92.5, result, 0.01);
    }

    @Test
    public void testCalculateAverageForUsersBelow40() {
        List<User> users = generateTestUsers();

        double result = ForumStats.calculateAverageForUsersBelow40(users);

        assertEquals(23.33, result, 0.01);
    }

    private static double calculateAverageForUsersBelow40(List<User> users) {
    }

    @Test
    public void testCalculateAverageForUsers40AndAboveNoUsers() {
        List<User> users = Arrays.asList(
                new User("User1", 25, 10, "Group1"),
                new User("User2", 30, 50, "Group2")
        );
        double result = ForumStats.calculateAverageForUsers40AndAbove(users);

        assertEquals(0, result);  // Oczekiwany wynik: 0, ponieważ nie ma użytkowników >= 40 lat
    }

    private static double calculateAverageForUsers40AndAbove(List<User> users) {
    }

    // Test dla przypadku brzegowego: brak użytkowników < 40 lat
    @Test
    public void testCalculateAverageForUsersBelow40NoUsers() {
        // Given
        List<User> users = Arrays.asList(
                new User("User1", 45, 10, "Group1"),
                new User("User2", 50, 50, "Group2")
        );

        double result = ForumStats.calculateAverageForUsersBelow40(users);
        assertEquals(0, result);  // Oczekiwany wynik: 0, ponieważ nie ma użytkowników < 40 lat
    }

    // Test dla przypadku brzegowego: brak użytkowników w ogóle
    @Test
    public void testCalculateAverageForEmptyUserList() {
        // Given
        List<User> users = Arrays.asList();  // Pusta lista użytkowników

        // When
        double resultForAbove40 = ForumStats.calculateAverageForUsers40AndAbove(users);
        double resultForBelow40 = ForumStats.calculateAverageForUsersBelow40(users);

        // Then
        assertEquals(0, resultForAbove40);  // Oczekiwany wynik: 0 dla >= 40 lat
}
