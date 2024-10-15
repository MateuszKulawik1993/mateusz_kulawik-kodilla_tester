package stream;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsersManagerTest {
    @Test
    public void testFilterChemistGroupUsernames() {

        List<String> expectedUsernames = List.of("Walter White", "Gale Boetticher");


        List<String> actualUsernames = UsersManager.filterChemistGroupUsernames();


        assertEquals(expectedUsernames, actualUsernames, "Usernames from Chemists group should match.");
    }
    @Test
    public void testFilterChemistGroupUsernames() {
        // Given
        List<String> expectedUsernames = List.of("Walter White", "Gale Boetticher");

        // When
        List<String> actualUsernames = UsersManager.filterChemistGroupUsernames();

        // Then
        assertEquals(expectedUsernames, actualUsernames, "Usernames from Chemists group should match.");
    }

    @Test
    public void testFilterUsersOlderThan() {
        // Given
        int ageLimit = 40;

        // When
        List<User> users = UsersManager.filterUsersOlderThan(ageLimit);

        // Then
        assertTrue(users.stream().allMatch(user -> user.getAge() > ageLimit), "All users should be older
}

